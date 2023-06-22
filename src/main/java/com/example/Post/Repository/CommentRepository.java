package com.example.Post.Repository;

import com.example.Post.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
