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
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/articleDetail")
	public String articleView(ArticleVO vo, Model model) {
		ArticleVO article = articleService.getArticle(vo);
		
		model.addAttribute("article", article);
		
		return "article/articleDetail";
	}
	
	@RequestMapping(value="/articleWriteForm")
	public String writeNewArticleForm(ArticleVO vo, Model model) {
		List<BoardVO> boardList = boardService.getAllBoards();
		
		model.addAttribute("article", vo);
		model.addAttribute("boardList", boardList);
		
		return "article/articleWrite";
	}
}
