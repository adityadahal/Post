package com.example.Post.Dto;

import com.example.Post.Model.Comment;
import lombok.Data;

import java.util.List;

@Data
public class PostDto {
    private int id;
    private String title;
    private String description;
    private List<Comment> comments;
}
