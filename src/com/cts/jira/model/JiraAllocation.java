package com.cts.jira.model;

import java.util.List;

public class JiraAllocation{
	private String jiraId;
	private List<String> memberId;
	public JiraAllocation() {
		super();
	}
	
	public JiraAllocation(String jiraId) {
		super();
		this.jiraId = jiraId;
	}
	
	public JiraAllocation(String jiraId, List<String> memberId) {
		super();
		this.jiraId = jiraId;
		this.memberId = memberId;
	}

	public String getJiraId() {
		return jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public List<String> getMemberId() {
		return memberId;
	}

	public void setMemberId(List<String> memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "JiraAllocation [jiraId=" + jiraId + ", memberId=" + memberId
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		return jiraId.equals(((Members)obj).getMemberId());
	}
}
