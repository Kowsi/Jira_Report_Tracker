package com.cts.jira.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.jira.dao.JiraDao;
import com.cts.jira.model.Jira;

@Repository
@Transactional(readOnly = true)
public class JiraDaoImpl implements JiraDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Jira> listJira() {
		return (List<Jira>)sessionFactory.openSession().createQuery("FROM Jira").list(); 
	}

	@Override
	public Jira searchJira(String id) {
		return (Jira) sessionFactory.openSession().createQuery(" FROM Jira WHERE Jira_Id=:Jira_Id").setString("Jira_Id", id).list().get(0);
	}
	
	
}
