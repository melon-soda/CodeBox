package com.codebox.project.article;

import java.util.List;

import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;

public interface ArticleService {
	List<ArticleVO> getAllArticles(BoardVO vo);
	
	ArticleVO getArticle(ArticleVO vo);
}
