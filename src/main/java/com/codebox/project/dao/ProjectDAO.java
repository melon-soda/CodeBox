package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.ProjectVO;

@Repository
public class ProjectDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<ProjectVO> getAllProjects() {
		return mybatis.selectList("ProjectDAO.getAllProjects");
	}
	
	public void createProject(ProjectVO vo) {
		mybatis.insert("ProjectDAO.createProject", vo);
	}
	
	public List<ProjectVO> searchProjectByTitle(String title) {
		return mybatis.selectList("ProjectDAO.searchProjectByTitle", title);
	}
	
	public ProjectVO getProjectByTitle(ProjectVO vo) {
		return mybatis.selectOne("ProjectDAO.getProjectByTitle", vo);
	}
}
