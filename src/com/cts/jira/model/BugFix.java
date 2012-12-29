package com.cts.jira.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BugFix")
public class BugFix{
	public static final List<String> BUG_STATUS = Arrays.asList(new String[]{"RESOLVED","UNRESOLVED","PENDING"});
	
	@Id
	@Column(name="Bugfix_Id")
	private String bugfixId;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Module_Name")
	private String moduleName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Jira_Id", nullable = false)
	private Jira jira;
	
	@OneToOne
	@JoinColumn(name="Responsibility_Id")
	private Member responsibility;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Start_Date")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="End_Date")
	private Date endDate;
	
	@Column(name="Status")
	private String status;
	
	public BugFix() {
		super();
	}
	
	public BugFix(String bugfixId) {
		super();
		this.bugfixId = bugfixId;
	}

	public BugFix(String bugfixId, String description, String moduleName,
			Jira jira, Member responsibility, Date startDate,
			Date endDate, String status) {
		super();
		this.bugfixId = bugfixId;
		this.description = description;
		this.moduleName = moduleName;
		this.jira = jira;
		this.responsibility = responsibility;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public String getBugfixId() {
		return bugfixId;
	}
	public void setBugfixId(String bugfixId) {
		this.bugfixId = bugfixId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Jira getJira() {
		return jira;
	}
	public void setJira(Jira jira) {
		this.jira = jira;
	}
	public Member getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(Member responsibility) {
		this.responsibility = responsibility;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BugFix [bugfixId=" + bugfixId + ", description=" + description
				+ ", moduleName=" + moduleName + ", responsibility=" + responsibility +", startDate="
				+ startDate + ", endDate=" + endDate + ", status=" + status
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		return bugfixId.equals(((BugFix)obj).getBugfixId());
	}	
}
