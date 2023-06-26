package com.example.Post.Controller;

import com.example.Post.Dto.LikeDto;
import com.example.Post.Model.Like;
import com.example.Post.Service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    LikeService likeService;

    @PostMapping("")
   public String createLike(@RequestBody LikeDto likeDto){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxDTOOOOOOOOOOOOOOOOOOOOOOOOOOO"+ likeDto);
        return likeService.createLike(likeDto);

    }

    @GetMapping("/postId/{id}")
    public Like findByPostId(@PathVariable int id){
        return  likeService.findLikeByPostId(id);
    }
}
