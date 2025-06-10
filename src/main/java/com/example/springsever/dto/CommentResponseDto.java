package com.example.springsever.dto;

import com.example.springsever.entity.Comment;
import lombok.Getter;

@Getter
public class CommentResponseDto {
    private final String content;

    public CommentResponseDto(Comment comment) {
        this.content = comment.getContent();

    }
}