package com.example.ArticleLogin.dto;


import com.example.ArticleLogin.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleDto {
    @NotBlank
    @Size(max = 40)
    private String title;

    @NotEmpty
    private String userid;

    @NotEmpty
    private String nickname;

    @NotEmpty
    private String content;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .nickname(nickname)
                .userid(userid)
                .content(content)
                .time(LocalDateTime.now())
                .build();
    }

}
