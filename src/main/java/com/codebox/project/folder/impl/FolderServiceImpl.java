package com.codebox.project.folder.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.dao.FolderDAO;
import com.codebox.project.dto.FolderVO;
import com.codebox.project.dto.ProjectVO;
import com.codebox.project.folder.FolderService;

@Service("folderService")
public class FolderServiceImpl implements FolderService {
	@Autowired
	private FolderDAO folderDao;

	@Override
	public List<FolderVO> getAllFolders(FolderVO vo) {
		return folderDao.getAllFolders(vo);
	}

	@Override
	public FolderVO getProjectTopFolder(ProjectVO vo) {
		return folderDao.getProjectTopFolder(vo);
	}

	@Override
	public void createProjectFolder(ProjectVO vo) {
		folderDao.createProjectFolder(vo);
	}
}
