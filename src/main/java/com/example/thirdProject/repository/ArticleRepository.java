package com.example.thirdProject.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.thirdProject.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
