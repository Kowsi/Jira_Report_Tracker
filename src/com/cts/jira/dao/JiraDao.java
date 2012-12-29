package com.cts.jira.dao;

import java.util.List;

import com.cts.jira.model.Jira;

public interface JiraDao {
	public List<Jira> listJira();
	public Jira searchJira(String id);
}
