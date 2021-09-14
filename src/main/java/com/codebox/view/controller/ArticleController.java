package com.codebox.view.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codebox.project.article.ArticleService;
import com.codebox.project.board.BoardService;
import com.codebox.project.dto.ArticleVO;
import com.codebox.project.dto.BoardVO;
import com.codebox.project.dto.MemberVO;

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
	
	@RequestMapping(value="/articleWrite")
	public String writeArticle(ArticleVO vo, HttpSession session, Model model) {
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		vo.setAuthor(loginUser.getId());
		
		articleService.insertArticle(vo);
		vo.setArticleseq(articleService.getLastArticleseqByAuthor(vo));
		
		vo = articleService.getArticle(vo);
		
		model.addAttribute("article", vo);
		
		return "article/articleDetail";
	}
	
	@RequestMapping(value="/articleUpdateForm")
	public String updateArticleForm(ArticleVO vo, Model model) {
		List<BoardVO> boardList = boardService.getAllBoards();
		ArticleVO article = articleService.getArticle(vo);
		
		model.addAttribute("article", article);
		model.addAttribute("boardList", boardList);
		
		return "article/articleUpdate";
	}
	
	@RequestMapping(value="/articleUpdate")
	public String updateArticle(ArticleVO vo, Model model) {
		articleService.updateArticle(vo);
		ArticleVO article = articleService.getArticle(vo);
		
		model.addAttribute("article", article);
		
		return "article/articleDetail";
	}
	
	@RequestMapping(value="/articleDelete")
	public String deleteArticle(ArticleVO vo, Model model) {
		articleService.deleteArticle(vo);
		
		return "redirect:/boardDetail?boardseq=" + vo.getBoardseq();
	}
}
