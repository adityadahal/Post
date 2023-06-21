package com.example.Post.Exception;


import org.springframework.web.bind.annotation.ResponseStatus;


public class ResourceNotFoundException extends RuntimeException {
   public ResourceNotFoundException(String message) {
    super(message);
    }


}
