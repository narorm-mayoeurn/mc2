package edu.mum.ea.controller;

import edu.mum.ea.domain.*;
import edu.mum.ea.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

/**
 * Created by darith on 7/17/17.
 */

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;



    @RequestMapping("/accommodation/list")
    public String roomListView() {

        return "room-list";
    }

    @RequestMapping("/booking/{id}")
    public String bookingFormView(Model model, @PathVariable Integer id) {

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

        model.addAttribute("id", 1);

        model.addAttribute("accommodation", accommodation);

        return "booking-form";
    }


    @RequestMapping(value = "/booking/{id}", method = RequestMethod.POST)
    public String booking(Model model, @PathVariable Integer id, @ModelAttribute("booking") Booking booking, BindingResult result) {
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
        user.setEmail("abc@abc.com");
        user.setFirstName("Jack");
        user.setLastName("Jon");
        user.setVersion(1L);

        booking.setBookBy(user);




        booking.setBookingDetails(Arrays.asList(bookingDetail));


        if(result.hasErrors()) {

        }

        bookingService.save(booking);

        return "booking-form";
    }
}
