<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div >
	<table  class="backgroundStyle">
		<tr>
			<td colspan="2" class="button-strap big green">${jira.getJiraId()}
				: ${jira.getJiraName()}</td>
		</tr>

		<tr>
			<td width="60%" class="button-strap medium orange">Description</td>
			<td class="button-strap medium orange">Team</td>
		</tr>
		<tr>
			<td class="box" style="color: #FF7300;" valign="top">
				<p class="secondContent">${jira.getDescription()}
				<p>
			</td>
			<td class="box">
				<div class="secondContent">
					<span style="font-weight: bold;">Onsite Member :</span>
					${jira.getOnsitememberId().getMemberName()}<br />
					<br /> <span style="font-weight: bold;">Team : </span>
					<ul>
						<c:forEach var="member" items="${jira.getTeamMembers()}">
							<li>${member.getMemberName()}</li>
						</c:forEach>
					</ul>
				</div>
			</td>
		</tr>

		<tr>
			<td colspan="2" class="button-strap medium orange">BugFix</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<table class="box" id="hor-minimalist-b" style="width: 100%">
					<tr>
						<th>BugFix Id</th>
						<th>Module Name</th>
						<th>Status</th>
						<th></th>
					</tr>
					<c:forEach var="bugFix" items="${jira.getBugFix()}">
						<tr>
							<td>${bugFix.getBugfixId()}</td>
							<td>${bugFix.getModuleName()}</td>
							<td>${bugFix.getStatus()}</td>
							<td><a href="#" rel="#${bugFix.getBugfixId()}"><button class="a-btn" ><span class="a-btn-symbol">&#8743;</span></button></a></td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>
	<c:forEach var="bugFix" items="${jira.getBugFix()}">
	<div class="overlay" id="${bugFix.getBugfixId()}">
		Description : ${bugFix.getBugfixId()}
	</div>
	</c:forEach>
</div>