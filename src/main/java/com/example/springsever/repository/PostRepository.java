package com.example.springsever.repository;

import com.example.springsever.entity.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();

    // 두메서드다 JpaRepository에서 제공하는 메서드로, 명시적으로 다시 선언할 필요X
    //Post save(Post post);

    //Optional<Post> findById(Long id);
}