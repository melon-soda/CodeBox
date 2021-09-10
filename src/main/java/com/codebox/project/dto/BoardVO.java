package com.codebox.project.dto;

import java.sql.Timestamp;

public class BoardVO {
	private int boardseq;
	private String title;
	private Timestamp createDate;
	
	public int getBoardseq() {
		return boardseq;
	}
	public void setBoardseq(int boardseq) {
		this.boardseq = boardseq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardseq=" + boardseq + ", title=" + title + ", createDate=" + createDate + "]";
	} 
}
