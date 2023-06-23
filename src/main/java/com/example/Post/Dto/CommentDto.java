package com.example.Post.Dto;

import com.example.Post.Model.Post;
import lombok.Data;

@Data
public class CommentDto {
    private int id;
    private String comment;
    private int postId;
}
