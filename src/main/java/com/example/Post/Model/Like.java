package com.example.Post.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "check_likes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @JsonProperty
    private  Boolean liked;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "post_id")
    @JsonIgnore
    private Post post;

}
