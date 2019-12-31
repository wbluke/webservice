package com.jojoldu.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsUpdateRequestDto {

    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(final String title, final String content) {
        this.title = title;
        this.content = content;
    }
}
