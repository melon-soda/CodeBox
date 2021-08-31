package com.codebox.project.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codebox.project.dto.CodeVO;
import com.codebox.project.dto.ProjectVO;

@Repository
public class CodeDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<CodeVO> getAllCodes(ProjectVO vo) {
		return mybatis.selectList("CodeDAO.getAllCodes", vo);
	}
	
	public CodeVO getCode(CodeVO vo) {
		return mybatis.selectOne("CodeDAO.getCode", vo);
	}
}