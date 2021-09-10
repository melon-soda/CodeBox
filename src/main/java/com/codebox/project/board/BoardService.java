package com.codebox.project.board;

import java.util.List;

import com.codebox.project.dto.BoardVO;

public interface BoardService {
	BoardVO getBoard(BoardVO vo);
	
	List<BoardVO> getAllBoards();
}
