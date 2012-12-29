package com.cts.jira.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Members")
public class Member {

	@Id
	@Column(name = "Memeber_Id")
	private String memberId;

	@Column(name = "Member_Name")
	private String memberName;
	
	@Column(name = "OnSite")
	private boolean onSite;

	@Column(name = "Project_Id")
	private String projectId;

	public Member() {
		super();
	}

	public Member(String memberId) {
		super();
		this.memberId = memberId;
	}

	public Member(String memberId, String memberName, boolean onSite,
			String projectId) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.onSite = onSite;
		this.projectId = projectId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public boolean isOnSite() {
		return onSite;
	}

	public void setOnSite(boolean onSite) {
		this.onSite = onSite;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
		
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName
				+ ", onSite=" + onSite + ", projectId=" + projectId + "]";
	}

	@Override
	public boolean equals(Object o) {
		return memberId.equals(((Member) o).getMemberId());
	}
}
