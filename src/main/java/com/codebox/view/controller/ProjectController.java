package com.codebox.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codebox.project.dto.ProjectVO;
import com.codebox.project.project.ProjectService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/project")
	public String allProjectsView(Model model) {
		List<ProjectVO> projectList = projectService.getAllProjects();
		
		model.addAttribute("projectList", projectList);
		
		return "project/projectMain";
	}
	
	@RequestMapping(value="/projectCreateForm")
	public String createNewProjectForm() {
		return "project/projectCreate";
	}
	
	@RequestMapping(value="/projectCreate")
	public String createNewProject(@RequestParam(value="title") String title, ProjectVO vo) {
		vo.setTitle(title);
		
		projectService.createProject(vo);
		
		return "redirect:project";
	}
}
