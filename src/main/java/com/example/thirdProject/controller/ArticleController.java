package com.example.thirdProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.example.thirdProject.dto.ArticleForm;
import com.example.thirdProject.entity.Article;
import com.example.thirdProject.repository.ArticleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        return "redirect:/articles/"+saved.getId();
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model)
    {
        System.out.println(id);
        Article articleEntity = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", articleEntity);
        return "articles/show";
    }



    @GetMapping("/articles")
    public String index(Model model)
    {
        ArrayList<Article> articleEntityList = articleRepository.findAll();
        model.addAttribute("articleList", articleEntityList);
        return "articles/index";
    }

    @GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model)
    {
        Article articleEntity = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", articleEntity);
        return "articles/edit";
    }

    @PostMapping("/articles/update")
    public String update(ArticleForm form)
    {
        Article article = form.toEntity();
        Article target = articleRepository.findById(article.getId()).orElse(null);
        if (target != null) articleRepository.save(article);
        return "redirect:/articles/"+article.getId();
    }
}
