package com.codebox.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codebox.project.article.ArticleService;
import com.codebox.project.board.BoardService;
import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(value="/board")
	public String boardView(BoardVO vo, Model model) {
		vo.setBoardseq(1);
		BoardVO board = boardService.getBoard(vo);
		List<ArticleVO> articleList = articleService.getAllArticles(vo);

		model.addAttribute("board1", board);
		model.addAttribute("articleList1", articleList);
		
		vo.setBoardseq(22);
		board = boardService.getBoard(vo);
		articleList = articleService.getAllArticles(vo);
		
		model.addAttribute("board2", board);
		model.addAttribute("articleList2", articleList);
		
		/* 여기에 나머지 2개 게시판도 구현 */
		
		return "board/boardMain";
	}
	
	@RequestMapping(value="/boardDetail")
	public String boardArticlesView(BoardVO vo, Model model) {
		BoardVO board = boardService.getBoard(vo);
		List<ArticleVO> articleList = articleService.getAllArticles(vo);
		
		model.addAttribute("board", board);
		model.addAttribute("articleList", articleList);
		
		return "board/boardDetail";
	}
}
