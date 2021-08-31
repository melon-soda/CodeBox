package com.codebox.project.dto;

import java.sql.Timestamp;

public class ProjectVO {
	private int projectseq;
	private Timestamp createDate;
	private Timestamp updateDate;
	private String title;
	private int likeCount;
	
	public int getProjectseq() {
		return projectseq;
	}
	public void setProjectseq(int projectseq) {
		this.projectseq = projectseq;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	@Override
	public String toString() {
		return "ProjectVO [projectseq=" + projectseq + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", title=" + title + ", likeCount=" + likeCount + "]";
	}
}
