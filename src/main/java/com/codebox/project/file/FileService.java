package com.codebox.project.file;

import java.util.List;

import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.FolderVO;

public interface FileService {
	List<FileVO> getAllFiles(FolderVO vo);
	
	FileVO getFile(FileVO vo);
}
