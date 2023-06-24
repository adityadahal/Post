package com.example.Post.Service;

import com.example.Post.Dto.PostDto;
import com.example.Post.Exception.ResourceNotFoundException;
import com.example.Post.Model.Comment;
import com.example.Post.Model.Like;
import com.example.Post.Model.Post;
import com.example.Post.Repository.CommentRepository;
import com.example.Post.Repository.LikeRepository;
import com.example.Post.Repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostImplService implements PostService {

    @Autowired
    PostRepository postRepository;
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    LikeRepository likeRepository;

    @Override
    public Post createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        return postRepository.save(post);
    }

    @Override
    public List<PostDto> getAllPost() {
        List<Post> postList = postRepository.findAll();
        List<PostDto> postDtoList = new ArrayList<>();

        for (Post post : postList) {
            List<Comment> comments = commentRepository.findAllByPostId(post.getId());
            Like like = likeRepository.findAllByPostId(post.getId());
            PostDto postDto = new PostDto();
            postDto.setDescription(post.getDescription());
            postDto.setId(post.getId());
            postDto.setTitle(post.getTitle());
            postDto.setComments(comments);
            postDtoList.add(postDto);
        }
        return postDtoList;
    }

    @Override
    public Post updatePost(int id, PostDto postDto) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found" + id));
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        return postRepository.save(post);
    }

    @Override
    @Transactional
    public  String  deletePost(int id) {
        List<Comment> commentList = commentRepository.findAllByPostId(id);
        for (Comment comment : commentList){
           commentRepository.deleteById(comment.getId());
        }
        postRepository.deleteById(id);
        return "Successfully deleted " + id;
    }
}
