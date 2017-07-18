package edu.mum.ea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by darith on 7/17/17.
 */

@Controller
public class BookingController {

    @RequestMapping("/")
    public String show() {

        return "home";
    }
}
