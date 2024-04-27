package com.fastcampus.projectbord.repository;

import com.fastcampus.projectbord.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
