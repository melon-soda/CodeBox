package com.codebox.project.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.board.BoardService;
import com.codebox.project.dao.BoardDAO;
import com.codebox.project.dto.BoardVO;
import com.codebox.project.utils.SearchObject;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDao;

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getAllBoards() {
		return boardDao.getAllBoards();
	}
}
