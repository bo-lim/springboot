package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter//6
@NoArgsConstructor//5
@Entity//1
public class Posts {//entity 클래스

    @Id//2
    @GeneratedValue(strategy = GenerationType.IDENTITY)//3
    private Long id;

    @Column(length = 500, nullable = false)//4
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder//7
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
