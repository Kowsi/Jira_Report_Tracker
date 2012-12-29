<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="accordion" class="backgroundStyle">
	<c:forEach var="jira" items="${jiraList}">
		<h2>
			${jira.getJiraName()}<label class="jira-status">${jira.getProgress()}</label>
		</h2> 
		<div>
					<h3>Project Id : ${jira.getProjectId()}</h3>
					<p>${jira.getDescription()}</p>
					
			<a href="#" onclick="$(location).attr('href','jiraDetails.htm?jiraId='+'${jira.getJiraId()}');"><input type="button" class="button orange" value="View.."/></a>
		</div>
	</c:forEach>
</div>