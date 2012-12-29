package com.cts.jira.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JIRA")
public class Jira {
	public static final List<String> PROGRESS_LIST = Arrays
			.asList(new String[] { "Planning", "Analysis", "Design", "Coding",
					"Unit Testing", "System Testing", "Bug Fix" });
	@Id
	@Column(name = "Jira_Id")
	private String jiraId;

	@Column(name = "Jira_Name")
	private String jiraName;

	@Column(name = "Project_Id")
	private String projectId;

	@Column(name = "Description")
	private String description;

	@Column(name = "Progress")
	private String progress;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OnsiteMember_Id")
	private Member onsitememberId;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "JiraAllocation", joinColumns = { @JoinColumn(name = "Jira_Id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Member_Id", nullable = false, updatable = false) })
	private Set<Member> teamMembers = new HashSet<Member>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jira")
	private Set<BugFix> bugFix = new HashSet<BugFix>();

	public Jira() {
		super();
	}

	public Jira(String jiraId) {
		super();
		this.jiraId = jiraId;
	}

	public Jira(String jiraId, String jiraName, String projectId,
			String description, String progress,
			Member onsitememberId, Set<Member> teamMembers, Set<BugFix> bugFix) {
		super();
		this.jiraId = jiraId;
		this.jiraName = jiraName;
		this.projectId = projectId;
		this.description = description;
		this.progress = progress;
		this.onsitememberId = onsitememberId;
		this.teamMembers = teamMembers;
		this.bugFix = bugFix;
	}

	public String getJiraId() {
		return jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public String getJiraName() {
		return jiraName;
	}

	public void setJiraName(String jiraName) {
		this.jiraName = jiraName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	
	public Member getOnsitememberId() {
		return onsitememberId;
	}

	public void setOnsitememberId(Member onsitememberId) {
		this.onsitememberId = onsitememberId;
	}

	public Set<Member> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(Set<Member> teamMembers) {
		this.teamMembers = teamMembers;
	}

	public Set<BugFix> getBugFix() {
		return bugFix;
	}

	public void setBugFix(Set<BugFix> bugFix) {
		this.bugFix = bugFix;
	}

	@Override
	public String toString() {
		return "Jira [jiraId=" + jiraId + ", jiraName=" + jiraName
				+ ", projectId=" + projectId + ", description=" + description
				+ ", progress=" + progress 
				+ ", onsite=" + onsitememberId + ", bugFix=" + bugFix + "]";
	}

	@Override
	public boolean equals(Object obj) {
		return jiraId.equals(((Jira) obj).getJiraId());
	}

	@Override
	public int hashCode() {
		return jiraId.hashCode();
	}
}
