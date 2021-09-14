package com.codebox.view.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codebox.project.contribution.ContributionService;
import com.codebox.project.dto.ContributionVO;
import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.FolderVO;
import com.codebox.project.dto.MemberVO;
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
	@Autowired
	private ContributionService contributionService;
	
	@RequestMapping(value="/project")
	public String allProjectsView(Model model) {
		List<ProjectVO> projectList = projectService.getAllProjects();
		
		model.addAttribute("projectList", projectList);
		
		return "project/projectMain";
	}
	
	@RequestMapping(value="/projectDetail")
	public String projectSourceView(ProjectVO pvo, Model model) {
		pvo = projectService.getProjectByTitle(pvo);
		FolderVO fvo = folderService.getProjectTopFolder(pvo);		
		//System.out.println(fvo);
		
		List<FolderVO> folderList = folderService.getAllFolders(fvo);
		List<FileVO> fileList = fileService.getAllFiles(fvo);
		//System.out.println(folderList);
		//System.out.println(fileList);
		
		model.addAttribute("folderList", folderList);
		model.addAttribute("fileList", fileList);
		
		ContributionVO cvo = new ContributionVO();
		
		cvo.setProjectseq(pvo.getProjectseq());
		System.out.println(pvo);
		System.out.println(cvo);
		
		cvo.setContributiontype("founder");
		List<ContributionVO> founderList = contributionService.getContributors(cvo);
		cvo.setContributiontype("contributor");
		List<ContributionVO> contributorList = contributionService.getContributors(cvo);
		System.out.println(founderList);
		System.out.println(contributorList);
		
		model.addAttribute("founderList", founderList);
		model.addAttribute("contributorList", contributorList);
		
		return "project/projectDetail";
	}
	
	@RequestMapping(value="/projectCreateForm")
	public String createNewProjectForm() {
		return "project/projectCreate";
	}
	
	@RequestMapping(value="/projectCreate")
	public String createNewProject(@RequestParam(value="title") String title, ProjectVO vo, HttpSession session) {
		vo.setTitle(title);
		
		projectService.createProject(vo);
		folderService.createProjectFolder(vo);
		
		ContributionVO cvo = new ContributionVO();
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		vo = projectService.getProjectByTitle(vo);
		
		cvo.setId(loginUser.getId());
		cvo.setProjectseq(vo.getProjectseq());
		cvo.setContributiontype("founder");
		
		contributionService.setContribution(cvo);
		
		return "redirect:project";
	}
	
	@RequestMapping(value="/projectSearch")
	public String searchProject(@RequestParam(value="key", defaultValue="") String key, Model model) {
		List<ProjectVO> projectList = projectService.searchProjectByTitle(key);
		
		model.addAttribute("projectList", projectList);
		
		return "project/projectMain";
	}
}
