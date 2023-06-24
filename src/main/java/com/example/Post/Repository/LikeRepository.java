package com.example.Post.Repository;

import com.example.Post.Model.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Integer> {
    Like findAllByPostId(int id);
}
