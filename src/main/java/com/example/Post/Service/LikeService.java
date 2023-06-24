package com.example.Post.Service;

import com.example.Post.Dto.LikeDto;
import org.springframework.stereotype.Service;

@Service
public interface LikeService {
    String createLike(LikeDto likeDto);

}
