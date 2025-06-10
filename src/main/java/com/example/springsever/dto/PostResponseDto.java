package com.example.springsever.dto;

import com.example.springsever.entity.Post;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import lombok.Getter;

@Getter
public class PostResponseDto {

    private final Long id;
    private final String title;
    private final String content;

    private final String username;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private final OffsetDateTime createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private final OffsetDateTime modifiedAt;

    private final List<CommentResponseDto> commentResponseDto;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.username = (post.getUser() != null) ? post.getUser().getUsername() : "Unknown";
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        // 댓글이 있으면 CommentResponseDto로 변환해서 리스트에 넣고, 없으면 빈 리스트 할당
        this.commentResponseDto = post.getCommentList() != null
                ? Collections.unmodifiableList(post.getCommentList().stream()
                .map(CommentResponseDto::new)
                .toList())
                : Collections.emptyList();
    }
}
