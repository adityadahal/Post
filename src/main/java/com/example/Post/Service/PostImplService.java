package com.example.Post.Service;

import com.example.Post.Dto.PostDto;
import com.example.Post.Exception.ResourceNotFoundException;
import com.example.Post.Model.Post;
import com.example.Post.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class PostImplService implements  PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post updatePost(int id, PostDto postDto) {
        Post post = postRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found"+ id));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        return postRepository.save(post);
    }

    @Override
    public String deletePost(int id) {
      postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
      postRepository.deleteById(id);
     return  "Successfully deleted " + id;
    }
}
