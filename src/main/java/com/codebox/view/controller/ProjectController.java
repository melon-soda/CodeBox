package com.codebox.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.FolderVO;
import com.codebox.project.dto.ProjectVO;
import com.codebox.project.file.FileService;
import com.codebox.project.folder.FolderService;
import com.codebox.project.project.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private FolderService folderService;
	@Autowired
	private FileService fileService;
	
	@RequestMapping(value="/project")
	public String allProjectsView(Model model) {
		List<ProjectVO> projectList = projectService.getAllProjects();
		
		model.addAttribute("projectList", projectList);
		
		return "project/projectMain";
	}
	
	@RequestMapping(value="/projectDetail")
	public String projectSourceView(ProjectVO pvo, Model model) {
		FolderVO fvo = folderService.getProjectTopFolder(pvo);
		System.out.println(fvo);
		List<FolderVO> folderList = folderService.getAllFolders(fvo);
		List<FileVO> fileList = fileService.getAllFiles(fvo);
		System.out.println(folderList);
		System.out.println(fileList);
		
		model.addAttribute("folderList", folderList);
		model.addAttribute("fileList", fileList);
		
		return "project/projectDetail";
	}
	
	@RequestMapping(value="/projectCreateForm")
	public String createNewProjectForm() {
		return "project/projectCreate";
	}
	
	@RequestMapping(value="/projectCreate")
	public String createNewProject(@RequestParam(value="title") String title, ProjectVO vo) {
		vo.setTitle(title);
		
		projectService.createProject(vo);
		folderService.createProjectFolder(vo);
		
		return "redirect:project";
	}
}
