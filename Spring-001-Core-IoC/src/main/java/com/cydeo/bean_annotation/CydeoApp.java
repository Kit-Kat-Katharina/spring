package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

       // PartTimeMentor pt = container.getBean("p1", PartTimeMentor.class);
        //pt.createAccount();

        //PartTimeMentor pt2 = container.getBean("p2", PartTimeMentor.class);
      //  pt2.createAccount();
        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);

        Integer num = container.getBean(Integer.class);
        System.out.println(num);


    }
}
