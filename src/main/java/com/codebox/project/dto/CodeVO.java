package com.codebox.project.dto;

import java.sql.Timestamp;

public class CodeVO {
	private int codeseq;
	private String langtype;
	private Timestamp writeDate;
	private Timestamp modDate;
	private String author;
	private String title;
	private String content;
	private int likeCount;
	
	public int getCodeseq() {
		return codeseq;
	}
	public void setCodeseq(int codeseq) {
		this.codeseq = codeseq;
	}
	public String getLangtype() {
		return langtype;
	}
	public void setLangtype(String langtype) {
		this.langtype = langtype;
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

	@Override
	public String toString() {
		return "CodeVO [codeseq=" + codeseq + ", langtype=" + langtype + ", writeDate=" + writeDate + ", modDate="
				+ modDate + ", author=" + author + ", title=" + title + ", content=" + content + ", likeCount="
				+ likeCount + "]";
	}
}
