package com.webcash.coocon.springboot.web.dto;

import com.webcash.coocon.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    Long id;
    String title;
    String content;
    String author;

    public PostsResponseDto(Posts entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.content=entity.getContent();
        this.author=entity.getAuthor();
    }

}
