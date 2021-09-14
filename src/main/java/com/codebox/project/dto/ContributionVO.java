package com.codebox.project.dto;

public class ContributionVO {
	private int contributionseq;
	private String id;
	private int projectseq;
	private String contributiontype;
	
	public int getContributionseq() {
		return contributionseq;
	}
	public void setContributionseq(int contributionseq) {
		this.contributionseq = contributionseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getProjectseq() {
		return projectseq;
	}
	public void setProjectseq(int projectseq) {
		this.projectseq = projectseq;
	}
	public String getContributiontype() {
		return contributiontype;
	}
	public void setContributiontype(String contributiontype) {
		this.contributiontype = contributiontype;
	}

	@Override
	public String toString() {
		return "ContributionVO [contributionseq=" + contributionseq + ", id=" + id + ", projectseq=" + projectseq
				+ ", contributiontype=" + contributiontype + "]";
	}
}
