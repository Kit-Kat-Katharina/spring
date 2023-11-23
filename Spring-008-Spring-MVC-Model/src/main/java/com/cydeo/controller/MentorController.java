package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController{
    @RequestMapping("/mentors") //http://localhost:8080/mentors
    public String mentorPage(Model model){
        List<Mentor> mentors = new ArrayList<>();
        mentors.add(new Mentor(45, Gender.MALE, "Mike", "Smith"));
        mentors.add(new Mentor(65, Gender.MALE, "Tom", "Hanks"));
        mentors.add(new Mentor(45, Gender.FEMALE, "Ammy", "Bryan"));
model.addAttribute("mentors",mentors);
     return "student/mentors/mentors";
    }

}
