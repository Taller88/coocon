package com.webcash.coocon.springboot.web;

import com.webcash.coocon.springboot.domain.posts.Posts;
import com.webcash.coocon.springboot.domain.posts.PostsRepository;
import com.webcash.coocon.springboot.web.dto.PostsResponseDto;
import com.webcash.coocon.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsSaveRequestDto requestDto){
        Posts posts=postsRepository.findById(id).orElseThrow( ()-> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        posts.update(requestDto.getTitle(),requestDto.getContent());
        return id;

    }

    public PostsResponseDto findById(Long id){
        Posts entity=postsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 게시긇이 없습니다 id"+id));
        return new PostsResponseDto(entity);
    }
}
