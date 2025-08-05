package com.example.thirdProject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    public Article(Long id, String title, String content)
    {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Article() { }

    @Override
    public String toString()
    {
        return title+", "+content;
    }

    public Long getId() {
        return this.id;
    }
}
