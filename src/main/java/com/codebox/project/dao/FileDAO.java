package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.FolderVO;

@Repository
public class FileDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<FileVO> getAllFiles(FolderVO vo) {
		return mybatis.selectList("FileDAO.getAllFiles", vo);
	}
	
	public FileVO getFile(FileVO vo) {
		return mybatis.selectOne("FileDAO.getFile", vo);
	}
}
