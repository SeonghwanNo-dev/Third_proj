package com.example.thirdProject.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.thirdProject.entity.Article;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}
