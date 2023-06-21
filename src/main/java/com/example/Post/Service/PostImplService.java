package com.example.Post.Service;

import com.example.Post.Dto.PostDto;
import com.example.Post.Model.Post;
import com.example.Post.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PostImplService implements  PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post createPost(@RequestBody PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPost() {
//        Post post = new Post();
//        post.setId(postDto.getId());
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
        return postRepository.findAll();
    }
}
