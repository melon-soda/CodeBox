package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public BoardVO getBoard(BoardVO vo) {
		return mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getAllBoards() {
		return mybatis.selectList("BoardDAO.getAllBoards");
	}
}
