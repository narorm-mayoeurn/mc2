package edu.mum.ea.controller;

import edu.mum.ea.domain.*;
import edu.mum.ea.service.BookingService;
import edu.mum.ea.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
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



    @RequestMapping("/accommodation/list")
    public String roomListView(Model model, @RequestParam("roomType") String roomType, @RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate) {

        Date start = null;
        Date end = null;

        if(startDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            start = new Date(startDate);
        }

        if(endDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
             end = new Date(endDate);
        }


        List<Room> rooms = roomService.findAllAvailable(roomType, start, end);

        model.addAttribute("rooms", rooms);

        return "room-list";
    }

    @RequestMapping("/booking/{roomId}")
    public String bookingFormView(Model model, @PathVariable Long roomId) {


        Room room = roomService.findById(roomId);


//        Accommodation accommodation = new Accommodation();
//        accommodation.setId(1L);
//        accommodation.setEmail("abc@gmail.com");
//        accommodation.setName("Ace Hotel");
//
//        Address address = new Address();
//        address.setCity("Fairfield");
//        address.setId(1L);
//        address.setState("IA");
//        address.setStreet("1000N");
//
//        Room room = new Room();
//        room.setId(1L);
//        room.setAvailable(true);
//        room.setRoomNumber("199");
//        room.setAccommodation(accommodation);
//        room.setImage("r1.jpg");
//
//        accommodation.setAddresses(Arrays.asList(address));
//        accommodation.setRooms(Arrays.asList(room));

        model.addAttribute("roomId", roomId);

        model.addAttribute("room", room);

        return "booking-form";
    }


    @RequestMapping(value = "/booking/{roomId}", method = RequestMethod.POST)
    public String booking(Model model, @ModelAttribute("booking") Booking booking, BindingResult result) {
        Accommodation accommodation = new Accommodation();
        accommodation.setId(1L);
        accommodation.setEmail("abc@gmail.com");
        accommodation.setName("Ace Hotel");

        Address address = new Address();
        address.setCity("Fairfield");
        address.setId(1L);
        address.setState("IA");
        address.setStreet("1000N");

        Room room = new Room();
        room.setId(1L);
        room.setAvailable(true);
        room.setRoomNumber("199");
        room.setAccommodation(accommodation);
        room.setImage("r1.jpg");

        accommodation.setAddresses(Arrays.asList(address));
        accommodation.setRooms(Arrays.asList(room));


        BookingDetail bookingDetail = new BookingDetail();
        bookingDetail.setRoom(room);


        User user = new User();
        user.setId(1L);
        user.setEmail("jack@mc2.org");
        user.setFirstName("Jack");
        user.setLastName("Jon");
        user.setVersion(1L);



        UserCredentials userCredentials = new UserCredentials();

        userCredentials.setUsername("jack");
        userCredentials.setPassword("jack");


        user.setUserCredential(userCredentials);



        booking.setBookBy(user);




        booking.setBookingDetails(Arrays.asList(bookingDetail));


        if(result.hasErrors()) {

        }

        booking.setBookingDate(new Date());
        bookingService.save(booking);


        model.addAttribute("accommodation", accommodation);

        return "booking-form";
    }
}
