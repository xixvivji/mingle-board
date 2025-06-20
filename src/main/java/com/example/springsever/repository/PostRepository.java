package com.example.springsever.repository;

import com.example.springsever.entity.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();

    // List<Post> findAllByUserIdOrderByCreatedAtDesc(Long userId);
    // UserId로 정렬하는 메서드는 현재 사용하지 않지만, 필요시 주석 해제하여 사용 가능

    //List<Post> findAllByUserIdOrderByCreatedAtDesc(Long userId);
    // UserId로 정렬하는 메서드는 현재 사용하지 않지만, 필요시 주석 해제하여 사용 가능

    // 두메서드다 JpaRepository에서 제공하는 메서드로, 명시적으로 다시 선언할 필요X
    //Post save(Post post);
    //Optional<Post> findById(Long id);
}