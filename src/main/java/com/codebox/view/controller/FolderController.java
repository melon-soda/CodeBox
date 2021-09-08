package com.codebox.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.FolderVO;
import com.codebox.project.file.FileService;
import com.codebox.project.folder.FolderService;

@Controller
public class FolderController {
	@Autowired
	private FolderService folderService;
	@Autowired
	private FileService fileService;
	
	@RequestMapping(value="/folderDetail")
	public String folderSourceView(FolderVO vo, Model model) {
		List<FolderVO> folderList = folderService.getAllFolders(vo);
		List<FileVO> fileList = fileService.getAllFiles(vo);
		
		model.addAttribute("folderList", folderList);
		model.addAttribute("fileList", fileList);
		
		return "folder/folderDetail";
	}
}
