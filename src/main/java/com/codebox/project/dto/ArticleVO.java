package com.codebox.project.dto;

import java.sql.Timestamp;

public class ArticleVO {
	private int articleseq;
	private int boardseq;
	private Timestamp writeDate;
	private Timestamp modDate;
	private String author;
	private String title;
	private String content;
	private int likeCount;
	private int viewCount;
	
	public int getArticleseq() {
		return articleseq;
	}
	public void setArticleseq(int articleseq) {
		this.articleseq = articleseq;
	}
	public int getBoardseq() {
		return boardseq;
	}
	public void setBoardseq(int boardseq) {
		this.boardseq = boardseq;
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
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	@Override
	public String toString() {
		return "ArticleVO [articleseq=" + articleseq + ", boardseq=" + boardseq + ", writeDate=" + writeDate
				+ ", modDate=" + modDate + ", author=" + author + ", title=" + title + ", content=" + content
				+ ", likeCount=" + likeCount + ", viewCount=" + viewCount + "]";
	}
}
