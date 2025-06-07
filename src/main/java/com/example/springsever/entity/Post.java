package com.example.springsever.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "post")
@NoArgsConstructor
public class Post extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "content", nullable = false)
    String content;

    @Column(name = "username", nullable = false)
    String username;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList = new ArrayList<>();


    public Post(PostRequestDto postRequestDto, String username) {
        this.title = postRequestDto.getTitle();
        this.content = postRequestDto.getContent();
        this.username = postRequestDto.getUsername();
    }


    public void update(PostRequestDto postrequestDto) {
        this.content = postrequestDto.getContent();
        this.title = postrequestDto.getTitle();
    }

    public void connectUser(User user) {
        this.user = user;
    }
}