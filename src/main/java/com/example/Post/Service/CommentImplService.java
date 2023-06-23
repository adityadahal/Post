package com.example.Post.Service;

import com.example.Post.Dto.BaseResponse;
import com.example.Post.Dto.CommentDto;
import com.example.Post.Model.Comment;
import com.example.Post.Model.Post;
import com.example.Post.Repository.CommentRepository;
import com.example.Post.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentImplService implements CommentService {
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    PostRepository postRepository;

    @Override
    public BaseResponse saveComment(CommentDto commentDto) {
        Optional<Post> post = postRepository.findById(commentDto.getPostId());
        if (post.isPresent()) {
            Comment comment = new Comment();
            comment.setComment(commentDto.getComment());
            comment.setPost(post.get());

            commentRepository.save(comment);
            return new BaseResponse(HttpStatus.OK, "Saved");
        }
        return new BaseResponse(HttpStatus.BAD_REQUEST, "Not Saved");
    }

    @Override
    public List<Comment> getComment() {
        return commentRepository.findAll();
    }

    @Override
    public String deleteComment(int id) {
       commentRepository.deleteById(id);
       return "Successfully Deleted Comment";
    }
}
