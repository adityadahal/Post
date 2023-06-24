package com.example.Post.Repository;

import com.example.Post.Model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
    Like findAllByPostId(int id);
}
