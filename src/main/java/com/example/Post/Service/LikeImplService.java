package com.example.Post.Service;

import com.example.Post.Dto.LikeDto;
import com.example.Post.Model.Like;
import com.example.Post.Model.Post;
import com.example.Post.Repository.LikeRepository;
import com.example.Post.Repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LikeImplService  implements  LikeService{
    @Autowired
    LikeRepository likeRepository;
    @Autowired
    PostRepository postRepository;

    @Override
    @Transactional
    public String createLike(LikeDto likeDto) {
        Optional<Post> post = postRepository.findById(likeDto.getPostId());
        if(post.isPresent()){
           Optional<Like> likeChecker = Optional.ofNullable(likeRepository.findByPostId(likeDto.getPostId()));
            likeRepository.deleteById(likeChecker.get().getId());
            Like like = new Like();
           like.setLiked(likeDto.getLiked());
            like.setPost(post.get());
            likeRepository.save(like);
            return "Succesfully Liked";
        }
        return "Couldn't be Liked or Disliked";


    }

    @Override
    public Like findLikeByPostId(int id) {
        Optional<Post> post = postRepository.findById(id);
        if(post.isPresent()){

        }
        return null;
    }
}
