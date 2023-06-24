package com.example.Post.Dto;

import com.example.Post.Model.Comment;
import com.example.Post.Model.Like;
import lombok.Data;

import java.util.List;

@Data
public class PostDto {
    private int id;
    private String title;
    private String description;
    private List<Comment> comments;
    private Like like;
}
