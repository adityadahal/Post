package com.example.Post.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LikeDto {
    private  int id;
    @JsonProperty
    private Boolean liked;
    private  int postId;
}
