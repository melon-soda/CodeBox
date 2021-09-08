package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.FolderVO;
import com.codebox.project.dto.ProjectVO;

@Repository
public class FolderDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<FolderVO> getAllFolders(FolderVO vo) {
		return mybatis.selectList("FolderDAO.getAllFolders", vo);
	}
	
	public FolderVO getProjectTopFolder(ProjectVO vo) {
		return mybatis.selectOne("FolderDAO.getProjectTopFolder", vo);
	}
	
	public void createProjectFolder(ProjectVO vo) {
		mybatis.insert("FolderDAO.createProjectFolder", vo);
	}
}
