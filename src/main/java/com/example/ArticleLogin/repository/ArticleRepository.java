package com.example.ArticleLogin.repository;

import com.example.ArticleLogin.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findByTitle(String title);
}
