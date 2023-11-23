package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public interface CommentRepository {void storeComment(Comment comment);
}
