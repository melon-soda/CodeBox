package com.codebox.project.folder;

import java.util.List;

import com.codebox.project.dto.FolderVO;
import com.codebox.project.dto.ProjectVO;

public interface FolderService {
	List<FolderVO> getAllFolders(FolderVO vo);
	
	FolderVO getProjectTopFolder(ProjectVO vo);
	
	void createProjectFolder(ProjectVO vo);
}
