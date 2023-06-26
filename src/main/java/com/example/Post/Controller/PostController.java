package com.example.Post.Controller;


import com.example.Post.Dto.PostDto;
import com.example.Post.Model.Post;
import com.example.Post.Service.PostImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostImplService postService;

    public PostController(PostImplService postService) {
        this.postService = postService;
    }

    @PostMapping("/save")
    public Post savePost(@RequestBody PostDto postDto) {
        return postService.createPost(postDto);
    }

    @GetMapping("/get")
    public List<PostDto> getAllPost() {
        return postService.getAllPost();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updatePost(@PathVariable int id, @RequestBody PostDto postDto) {
        return ResponseEntity.ok(postService.updatePost(id, postDto));
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        return postService.deletePost(id);
    }
}
