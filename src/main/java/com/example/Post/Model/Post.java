package com.example.Post.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    private  String title;

    private String description;

    @OneToMany
    @JoinColumn(name = "comment_id")
    private Comment comment;


}
