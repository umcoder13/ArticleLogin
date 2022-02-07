package com.example.ArticleLogin.repository;

import com.example.ArticleLogin.dto.ArticleDto;
import com.example.ArticleLogin.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ArticleRepositoryTest {
    @Autowired
    ArticleRepository repository;


    @Test
    @Transactional
    @Rollback(false)
    public void testArticle() {
        ArticleDto dto = new ArticleDto(
                "title", "id", "nickname", "content"
        );
        Article article = dto.toEntity();

        repository.saveAndFlush(article);

        Article findArticle = repository.findByTitle(article.getTitle());

        assertEquals(findArticle.getId(), article.getId());
        assertEquals(findArticle.getUserid(), article.getUserid());
        assertEquals(findArticle, article);
    }


}