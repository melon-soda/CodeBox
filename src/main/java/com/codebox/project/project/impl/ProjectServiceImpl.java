package com.codebox.project.project.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.dao.ProjectDAO;
import com.codebox.project.dto.ProjectVO;
import com.codebox.project.project.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDAO projectDao;

	@Override
	public List<ProjectVO> getAllProjects() {
		return projectDao.getAllProjects();
	}

	@Override
	public void createProject(ProjectVO vo) {
		projectDao.createProject(vo);
	}

	@Override
	public List<ProjectVO> searchProjectByTitle(String title) {
		return projectDao.searchProjectByTitle(title);
	}

	@Override
	public ProjectVO getProjectByTitle(ProjectVO vo) {
		return projectDao.getProjectByTitle(vo);
	}
}
