package com.codebox.project.code;

import java.util.List;

import com.codebox.project.dto.CodeVO;
import com.codebox.project.dto.ProjectVO;

public interface CodeService {
	List<CodeVO> getAllCodes(ProjectVO vo);
	
	CodeVO getCode(CodeVO vo);
}
