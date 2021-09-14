package com.codebox.project.board;

import java.util.List;

import com.codebox.project.dto.BoardVO;
import com.codebox.project.utils.SearchObject;

public interface BoardService {
	BoardVO getBoard(BoardVO vo);
	
	List<BoardVO> getAllBoards();	
}
