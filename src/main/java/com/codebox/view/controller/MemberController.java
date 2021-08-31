package com.codebox.view.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.codebox.project.dto.MemberVO;
import com.codebox.project.member.MemberService;

@Controller
@SessionAttributes("loginUser")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/login_form", method=RequestMethod.GET)
	public String loginView() {
		return "member/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(MemberVO vo, Model model) {
		MemberVO loginUser = null;
		int result = memberService.attemptLogin(vo);
		
		if(result == 1) {
			loginUser = memberService.getMember(vo.getId());
			
			model.addAttribute("loginUser", loginUser);

			return "redirect:/index";
		} else {
			return "member/login";
		}
	}
	
	@RequestMapping(value="/contract", method=RequestMethod.GET)
	public String contractView() {
		return "member/contract";
	}
	
	@RequestMapping(value="/join_form", method=RequestMethod.POST)
	public String joinView() {
		return "member/join";
	}
	
	@RequestMapping(value="/join")
	public String joinAction(@RequestParam(value="profile_Pic") MultipartFile uploadFile, MemberVO vo, HttpSession session) {
		String fileName = "";
		
		if(!uploadFile.isEmpty()) {
			fileName = uploadFile.getOriginalFilename();
		} else {
			fileName = "default.png";
		}
		
		vo.setProfilePic(fileName);	

		String imagePath = session.getServletContext().getRealPath("WEB-INF/resources/images/profilePic/");
		System.out.println(imagePath);
		
		try {
			File file = new File(imagePath + fileName);
			uploadFile.transferTo(file);
		} catch(IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		memberService.insertMember(vo);
		
		return "member/login";
	}
}
