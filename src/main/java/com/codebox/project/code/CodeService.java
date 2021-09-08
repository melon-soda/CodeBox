package com.codebox.project.code;

import java.util.List;

import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.ProjectVO;

public interface CodeService {
	List<FileVO> getAllCodes(ProjectVO vo);
	
	FileVO getCode(FileVO vo);
}
