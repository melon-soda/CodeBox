package com.codebox.project.article.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.article.ArticleService;
import com.codebox.project.dao.ArticleDAO;
import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;
import com.codebox.project.utils.SearchObject;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDAO articleDao;

	@Override
	public List<ArticleVO> getAllArticles(BoardVO vo) {
		return articleDao.getAllArticles(vo);
	}

	@Override
	public ArticleVO getArticle(ArticleVO vo) {
		return articleDao.getArticle(vo);
	}

	@Override
	public void insertArticle(ArticleVO vo) {
		articleDao.insertArticle(vo);
	}
	
	@Override
	public int getLastArticleseqByAuthor(ArticleVO vo) {
		return articleDao.getLastArticleseqByAuthor(vo);
	}
	
	@Override
	public void updateArticle(ArticleVO vo) {
		articleDao.updateArticle(vo);
	}
	
	@Override
	public void deleteArticle(ArticleVO vo) {
		articleDao.deleteArticle(vo);
	}

	@Override
	public List<ArticleVO> searchArticle(SearchObject searchObject) {
		return articleDao.searchArticle(searchObject);
	}
}
