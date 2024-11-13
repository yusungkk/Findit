package com.FindIt.FindIt.dto;


import lombok.Data;

@Data
public class CommentsDto {
    private int commentId;
    private String userName;
    private String profileImageUrl;
    private String comment;
    private String createdAt;
}
