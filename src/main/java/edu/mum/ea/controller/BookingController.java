package edu.mum.ea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by darith on 7/17/17.
 */

@Controller
public class BookingController {


    @RequestMapping("/accommodation/list")
    public String roomListView() {

        return "room-list";
    }

    @RequestMapping("/booking/{id}")
    public String bookingFormView(Model model, @PathVariable Integer id) {


        return "booking-form";
    }

}
