package com.codebox.project.dto;

import java.sql.Timestamp;

public class FileVO {
	private int fileseq;
	private String filetype;
	private Timestamp writeDate;
	private Timestamp modDate;
	private String author;
	private String title;
	private String content;
	private int likeCount;
	private int parentdirectoryseq;
	
	public int getFileseq() {
		return fileseq;
	}
	public void setFileseq(int fileseq) {
		this.fileseq = fileseq;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	public Timestamp getModDate() {
		return modDate;
	}
	public void setModDate(Timestamp modDate) {
		this.modDate = modDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getParentdirectoryseq() {
		return parentdirectoryseq;
	}
	public void setParentdirectoryseq(int parentdirectoryseq) {
		this.parentdirectoryseq = parentdirectoryseq;
	}
	@Override
	public String toString() {
		return "FileVO [fileseq=" + fileseq + ", filetype=" + filetype + ", writeDate=" + writeDate + ", modDate="
				+ modDate + ", author=" + author + ", title=" + title + ", content=" + content + ", likeCount="
				+ likeCount + ", parentdirectoryseq=" + parentdirectoryseq + "]";
	}
}
