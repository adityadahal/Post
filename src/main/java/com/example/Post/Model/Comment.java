package com.example.Post.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "post_id" )
    @JsonIgnore
    private Post post;

}
