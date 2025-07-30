package com.example.thirdProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.thirdProject.dto.ArticleForm;
import com.example.thirdProject.entity.Article;
import com.example.thirdProject.repository.ArticleRepository;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("articles/create")
    public String createArticle(ArticleForm form)
    {
        System.out.println(form.toString());
        Article article = form.toEntity();
        Article saved = articleRepository.save(article);

        System.out.println(article.toString());
        System.out.println(saved.toString());
        return "";
    }
}
