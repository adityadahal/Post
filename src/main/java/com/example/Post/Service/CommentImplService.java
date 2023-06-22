package com.example.Post.Service;

import com.example.Post.Dto.BaseResponse;
import com.example.Post.Dto.CommentDto;
import com.example.Post.Model.Comment;
import com.example.Post.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class CommentImplService implements CommentService {
    @Autowired
    CommentRepository commentRepository;
    @Override
    public BaseResponse saveComment(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setComment(commentDto.getComment());
        commentRepository.save(comment);
        return new BaseResponse(HttpStatus.OK, "Saved");
    }
}
