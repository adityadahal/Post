package com.example.Post.Service;

import com.example.Post.Dto.LikeDto;
import com.example.Post.Model.Like;
import org.springframework.stereotype.Service;

@Service
public interface LikeService {
    String createLike(LikeDto likeDto);

    Like findLikeByPostId(int id);

}
