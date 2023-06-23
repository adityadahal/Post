package com.example.Post.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Like {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  int id;
    private  boolean isLiked;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Post post;

}
