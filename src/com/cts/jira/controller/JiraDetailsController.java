package com.cts.jira.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cts.jira.dao.JiraDao;


public class JiraDetailsController implements Controller {

	@Autowired
	JiraDao jiraDao;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			String jiraId= request.getParameter("jiraId");
			return new ModelAndView("JiraDetails", "jira", jiraDao.searchJira(jiraId));	
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("ErrorPage", "error.message", e.toString());
		}
	}
}
