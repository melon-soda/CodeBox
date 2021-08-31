package com.codebox.project.code.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.code.CodeService;
import com.codebox.project.dao.CodeDAO;
import com.codebox.project.dto.CodeVO;
import com.codebox.project.dto.ProjectVO;

@Service("codeService")
public class CodeServiceImpl implements CodeService {
	@Autowired
	private CodeDAO codeDao;

	@Override
	public List<CodeVO> getAllCodes(ProjectVO vo) {
		return codeDao.getAllCodes(vo);
	}

	@Override
	public CodeVO getCode(CodeVO vo) {
		return codeDao.getCode(vo);
	}
}
