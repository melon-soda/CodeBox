package com.codebox.project.project;

import java.util.List;

import com.codebox.project.dto.ProjectVO;

public interface ProjectService {
	List<ProjectVO> getAllProjects();
	
	void createProject(ProjectVO vo);
	
	List<ProjectVO> searchProjectByTitle(String title);
	
	ProjectVO getProjectByTitle(ProjectVO vo);
}
