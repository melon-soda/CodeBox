package com.codebox.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codebox.project.code.CodeService;
import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.ProjectVO;

@Controller
public class CodeController {
	@Autowired
	private CodeService codeService; 
	
/*
	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public String allCodesView(ProjectVO vo, Model model) {
		List<FileVO> codeList = codeService.getAllCodes(vo);
		
		model.addAttribute("codeList", codeList);
		
		return "project/projectDetail";
	}
*/
	
	@RequestMapping(value="/codeDetail")
	public String codeView(FileVO vo, Model model) {
		FileVO code = codeService.getCode(vo);
		
		model.addAttribute("code", code);
		
		return "code/codeDetail";
	}
	
	@RequestMapping(value="/codeWriteForm")
	public String writeNewCode() {
		return "code/codeWrite";
	}
}
