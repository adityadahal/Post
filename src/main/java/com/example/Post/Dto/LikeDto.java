package com.example.Post.Dto;

import lombok.Data;

@Data
public class LikeDto {
    private  int id;
    private boolean isLiked = false;
}
