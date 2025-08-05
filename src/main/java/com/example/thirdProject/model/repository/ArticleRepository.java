package com.example.thirdProject.model.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.thirdProject.model.entity.Article;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}
