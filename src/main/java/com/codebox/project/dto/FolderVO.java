package com.codebox.project.dto;

public class FolderVO {
	private int folderseq;
	private String title;
	private int parentdirectoryseq;
	
	public int getFolderseq() {
		return folderseq;
	}
	public void setFolderseq(int folderseq) {
		this.folderseq = folderseq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getParentdirectoryseq() {
		return parentdirectoryseq;
	}
	public void setParentdirectoryseq(int parentdirectoryseq) {
		this.parentdirectoryseq = parentdirectoryseq;
	}
	@Override
	public String toString() {
		return "FolderVO [folderseq=" + folderseq + ", title=" + title + ", parentdirectoryseq=" + parentdirectoryseq
				+ "]";
	}
}
