<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="http://code.jquery.com/ui/1.9.1/jquery-ui.js"></script>
<script type="text/javascript" src="${'resources/js/myjs.js'}"></script>
<link type="text/css" rel="stylesheet" href="${'resources/css/mycss.css'}"/>
<title><tiles:insertAttribute name="title" /></title>

</head>
<body class="bgimage">
	<div class="target">
		<div id="header">JIRA Report Tracker</div>
		<div class="body">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>