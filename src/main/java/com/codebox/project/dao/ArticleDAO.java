package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;
import com.codebox.project.utils.SearchObject;

@Repository
public class ArticleDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<ArticleVO> getAllArticles(BoardVO vo) {
		return mybatis.selectList("ArticleDAO.getAllArticles", vo);
	}
	
	public ArticleVO getArticle(ArticleVO vo) {
		return mybatis.selectOne("ArticleDAO.getArticle", vo);
	}
	
	public void insertArticle(ArticleVO vo) {
		mybatis.insert("ArticleDAO.insertArticle", vo);
	}
	
	public int getLastArticleseqByAuthor(ArticleVO vo) {
		return mybatis.selectOne("ArticleDAO.getLastArticleseqByAuthor", vo);
	}
	
	public void updateArticle(ArticleVO vo) {
		mybatis.update("ArticleDAO.updateArticle", vo);
	}
	
	public void deleteArticle(ArticleVO vo) {
		mybatis.delete("ArticleDAO.deleteArticle", vo);
	}
	
	public List<ArticleVO> searchArticle(SearchObject searchObject) {
		return mybatis.selectList("ArticleDAO.searchArticle", searchObject);
	}
}
