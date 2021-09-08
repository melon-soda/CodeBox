package com.codebox.project.file.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebox.project.dao.FileDAO;
import com.codebox.project.dto.FileVO;
import com.codebox.project.dto.FolderVO;
import com.codebox.project.file.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService {
	@Autowired
	private FileDAO fileDao;

	@Override
	public List<FileVO> getAllFiles(FolderVO vo) {
		return fileDao.getAllFiles(vo);
	}

	@Override
	public FileVO getFile(FileVO vo) {
		return fileDao.getFile(vo);
	}
}
