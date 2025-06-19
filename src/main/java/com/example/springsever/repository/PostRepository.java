package com.example.springsever.repository;

import com.example.springsever.entity.Post;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();

    Post save(Post post);

    Optional<Post> findById(Long id);
}