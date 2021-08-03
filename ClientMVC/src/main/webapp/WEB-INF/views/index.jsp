<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/views/client/taglib.jsp"%>

<body>
	<div style="height: 30px; background-color: darkcyan;"></div>
	<h3>Welcome to DXC Technology</h3>
	<c:if test="${count > 0 }">
		<p><spring:message code="message.addingSucceeded" /></p>
	</c:if>
	<c:if test="${count == 0 }">
		<p><spring:message code="message.addingFailed" /></p>
	</c:if>
</body>