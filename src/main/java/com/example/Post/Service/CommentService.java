package com.example.Post.Service;

import com.example.Post.Dto.BaseResponse;
import com.example.Post.Dto.CommentDto;

public interface CommentService {
   BaseResponse saveComment(CommentDto commentDto);

}
