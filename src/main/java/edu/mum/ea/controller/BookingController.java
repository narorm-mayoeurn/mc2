package edu.mum.ea.controller;

import edu.mum.ea.domain.*;
import edu.mum.ea.service.BookingService;
import edu.mum.ea.service.RoomService;
import edu.mum.ea.service.UserCredentialsService;
import edu.mum.ea.service.UserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by darith on 7/17/17.
 */

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private UserCredentialsService userCredentialsService;

    @Autowired
    private RabbitTemplate directTemplate;



    @RequestMapping("/accommodation/list")
    public String roomListView(
            Model model,
            @RequestParam(value = "roomType", required = false) String roomType,
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "endDate", required = false) String endDate) {

        Date start = null;
        Date end = null;

        if(startDate != null && startDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            start = new Date(startDate);
        }

        if(endDate != null && endDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
             end = new Date(endDate);
        }

        User user = getCurrentUser();

        try {
            List<Room> rooms = roomService.findAllAvailable(roomType, start, end);
            model.addAttribute("rooms", rooms);
            model.addAttribute("isLogged", user == null ? false : true);
            return "room-list";
        } catch(Exception e) {
            return "home";
        }

    }

    @RequestMapping("/booking/{roomId}")
    public String bookingFormView(Model model, @PathVariable Long roomId) {

        try {
            Room room = roomService.findById(roomId);

            model.addAttribute("roomId", roomId);
            model.addAttribute("room", room);

            return "booking-form";
        } catch(Exception e) {
            return "home";
        }
    }


    @RequestMapping(value = "/booking/{roomId}", method = RequestMethod.POST)
    public String booking(Model model, @PathVariable Long roomId, @ModelAttribute("booking") Booking booking, BindingResult result) {


        Room room = roomService.findById(roomId);
        User currentUser = getCurrentUser();

        BookingDetail bookingDetail = new BookingDetail();
        bookingDetail.setRoom(room);

        booking.setBookBy(currentUser);
        booking.setBookingDetails(Arrays.asList(bookingDetail));


        if(result.hasErrors()) {
            model.addAttribute("errorMessage", "Cannot processing booking.");
        }

        try {
            booking.setBookingDate(new Date());
            bookingService.save(booking);

            if(room.getPrice() >= 100) {
                bookingService.publish(directTemplate, currentUser);
            }

            model.addAttribute("message", "A hotel room has been booked.");
        } catch(Exception e) {

            model.addAttribute("message", "Error booking process.");
            e.printStackTrace();
        }


        model.addAttribute("room", room);

        return "booking-form";
    }

    private User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication == null) return null;
        UserCredentials credentials = userCredentialsService.findByUsername(authentication.getName());

        User user = null;
        if(credentials != null) user = credentials.getUser();
        return user;
    }
}
