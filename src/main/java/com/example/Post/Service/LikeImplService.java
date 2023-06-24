package com.example.Post.Service;

import com.example.Post.Dto.LikeDto;
import com.example.Post.Model.Like;

public class LikeImplService  implements  LikeService{

    @Override
    public String createLike(LikeDto likeDto) {
        Like like = new Like();
        like.setLiked(!likeDto.isLiked());
        return "Succesfully Liked";
    }
}
