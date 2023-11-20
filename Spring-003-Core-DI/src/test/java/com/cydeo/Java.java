package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class Java {
    //Field Injection
   // @Autowired
   // OfficeHours officeHours;

    //Constructor Injection
    OfficeHours officeHours;

//    @Autowired
//    public Java(OfficeHours officeHours){
//        this.officeHours = officeHours;
//    }
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20+officeHours.getHours()));
    }
}
