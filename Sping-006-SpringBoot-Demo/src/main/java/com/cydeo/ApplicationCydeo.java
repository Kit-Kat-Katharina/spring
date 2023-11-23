package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationCydeo {

    public static void main(String[] args) {


        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("spring Framework");

        ApplicationContext context = SpringApplication.run(ApplicationCydeo.class, args);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.pubishComment(comment);
    }

}
