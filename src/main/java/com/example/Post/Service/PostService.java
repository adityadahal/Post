package com.example.Post.Service;

import com.example.Post.Dto.PostDto;
import com.example.Post.Model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post createPost(PostDto postDto);
    List <Post> getAllPost();



}
