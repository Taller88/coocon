package com.webcash.coocon.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //..extends JpaRespository<Entity 클래스, PK타입>
    
}
