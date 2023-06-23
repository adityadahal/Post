package com.example.Post.Service;

import com.example.Post.Dto.BaseResponse;
import com.example.Post.Dto.CommentDto;
import com.example.Post.Model.Comment;

import java.util.List;

public interface CommentService {
   BaseResponse saveComment(CommentDto commentDto);
   List<Comment> getComment();

   String deleteComment(int id);

}
