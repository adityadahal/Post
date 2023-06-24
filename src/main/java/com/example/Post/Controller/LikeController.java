package com.example.Post.Controller;

import com.example.Post.Dto.LikeDto;
import com.example.Post.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    LikeService likeService;

    @PostMapping("")
    String createLike(LikeDto likeDto){
        return likeService.createLike(likeDto);

    }
}
