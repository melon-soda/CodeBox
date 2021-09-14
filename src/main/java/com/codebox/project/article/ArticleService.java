package com.codebox.project.article;

import java.util.List;

import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;
import com.codebox.project.utils.SearchObject;

public interface ArticleService {
	List<ArticleVO> getAllArticles(BoardVO vo);
	
	ArticleVO getArticle(ArticleVO vo);

	void insertArticle(ArticleVO vo);
	
	int getLastArticleseqByAuthor(ArticleVO vo);
	
	void updateArticle(ArticleVO vo);
	
	void deleteArticle(ArticleVO vo);
	
	List<ArticleVO> searchArticle(SearchObject searchObject);
}
