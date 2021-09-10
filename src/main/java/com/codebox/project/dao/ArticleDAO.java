package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;

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
}
