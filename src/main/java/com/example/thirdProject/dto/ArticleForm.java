package com.example.thirdProject.dto;

import com.example.thirdProject.entity.Article;

public class ArticleForm {
    private String title;
    private String content;

    public ArticleForm(String title, String content)
    {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString()
    {
        return this.title+", "+this.content;
    }

    public Article toEntity()
    {
        return new Article(null, this.title, this.content);
    }
}
