package com.example.Post.Controller;


import com.example.Post.Dto.PostDto;
import com.example.Post.Model.Post;
import com.example.Post.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("/save")
    public  Post savePost(@RequestBody PostDto postDto){
        return  postService.createPost(postDto);
    }

    @GetMapping("/get")
    public List<Post> getAllPost(){
        return  postService.getAllPost();
    }

    @PutMapping("/getByid/{id}")
    public ResponseEntity<?> updatePost(@PathVariable int id, @RequestBody PostDto postDto){
        return  ResponseEntity.ok(postService.updatePost(id, postDto));
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable int id){
        return  postService.deletePost(id);
    }
}
