package com.FindIt.FindIt.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TestDto {
    private int userId;
    private String userName;
    private List<CommentsDto> comments;
}
