package com.example.testweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WebController {

    public WebController() {
    }

    ;

    @GetMapping("/")
    public String getPage() {
        return "This is welcome page. Current time is " + LocalDateTime.now().toString();
    }


}
