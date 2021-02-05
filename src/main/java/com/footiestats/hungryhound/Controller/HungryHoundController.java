package com.footiestats.hungryhound.Controller;

import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping(value = "/kafka")
    public class HungryHoundController {


        @GetMapping(value = "/publish")
        public String getHello (){
            return "hello from hungry hound";
        }


    }
