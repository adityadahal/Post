package com.example.Post.Controller;


import com.example.Post.Dto.BaseResponse;
import com.example.Post.Dto.CommentDto;
import com.example.Post.Dto.PostDto;
import com.example.Post.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/save")
    public BaseResponse save(CommentDto commentDto){
       return commentService.saveComment(commentDto);
    }
}
