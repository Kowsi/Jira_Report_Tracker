package com.cts.jira.model;

public class Members {
	private String memberId;
	private String memberName;
	private boolean onSite;
	private String projectId;

	public Members() {
		super();
	}

	public Members(String memberId) {
		super();
		this.memberId = memberId;
	}

	public Members(String memberId, String memberName, boolean onSite,
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
		return "Members [memberId=" + memberId + ", memberName=" + memberName
				+ ", onSite=" + onSite + ", projectId=" + projectId + "]";
	}

	@Override
	public boolean equals(Object o) {
		return memberId.equals(((Members)o).getMemberId());
	}
}
