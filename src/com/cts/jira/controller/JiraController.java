package com.cts.jira.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cts.jira.dao.JiraDao;
import com.cts.jira.model.Jira;

public class JiraController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	JiraDao jiraDao;


	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		try {
			logger.info("Returning hello view");
			List<Jira> jiraList = jiraDao.listJira();
			System.out.println(jiraList);
			
			return new ModelAndView("JiraList", "jiraList", jiraList);
		} catch (Exception e) {
			System.out.println(e.toString());
			return new ModelAndView("ErrorPage", "error.message", e.toString());
		}
	}
	
}
