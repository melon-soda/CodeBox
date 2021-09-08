package com.codebox.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codebox.project.dto.FileVO;
import com.codebox.project.file.FileService;

@Controller
public class FileController {
	@Autowired
	private FileService fileService;
	
	@RequestMapping(value="/fileDetail")
	public String fileView(FileVO vo, Model model)	{
		FileVO file = fileService.getFile(vo); 
		
		model.addAttribute("file", file);
		
		return "files/fileDetail";
	}
}
