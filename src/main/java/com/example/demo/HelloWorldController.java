package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/swe")
    public String hejsanvärlden(){
        return "Hejsan världen";
    }
    @RequestMapping("/عربي")
    public String مرحبابالعالم(){
        return "مرحبا بالعالم";
    }
    @RequestMapping("/esp")
    public String HolaMundo(){
        return "Hola Mundo";
    }

    @RequestMapping("/eng")
    public String HelloWorld(){
        return "Hello World";
    }
    @RequestMapping("/hello")
    public String addFoo(@RequestParam String firstname, @RequestParam String lastname){
        return "Hejsan " + firstname + " " + lastname;
    }
}
