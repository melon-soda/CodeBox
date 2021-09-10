package com.codebox.project.article.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.article.ArticleService;
import com.codebox.project.dao.ArticleDAO;
import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;

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
}
