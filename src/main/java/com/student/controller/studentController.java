package com.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {


    @RequestMapping("hello")
    String display(){

        return "hello worrld!!";

    }
}
