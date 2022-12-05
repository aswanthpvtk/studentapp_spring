package com.example.studentapp2_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {
    @GetMapping("/")
    public String Homepage()
    {
        return "welcom to my web page";
    }

    @GetMapping("/contact")
   public String Contact()
    {
        return "welcom to my contact page";
    }

    @GetMapping("/gallary")
    public String Gallery()
    {
        return "welcom to my gallary page";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "welcom to my home page";
    }




}
