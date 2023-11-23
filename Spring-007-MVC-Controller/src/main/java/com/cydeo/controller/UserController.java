package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller //Annotate the class with the @Controller stereotype annotation
public class UserController {

    @RequestMapping("/user")//Use @RequestingMapping annotation to associate the action with the HTTP request
    public String user() {
        //return "userinfo.html"; -> means go to folder static and look over there that's why we need to change to
        String a = "apple";
        return "/user/userinfo.html";
    }
}