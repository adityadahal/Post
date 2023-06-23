package com.example.Post.Controller;


import com.example.Post.Dto.BaseResponse;
import com.example.Post.Dto.CommentDto;
import com.example.Post.Model.Comment;
import com.example.Post.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/save")
    public BaseResponse save(@RequestBody CommentDto commentDto) {
        return commentService.saveComment(commentDto);
    }

    @GetMapping("/get")
    public List<Comment> getAll() {
        return commentService.getComment();
    }
}

