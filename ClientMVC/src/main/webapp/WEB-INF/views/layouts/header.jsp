<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title><decorator:title default="Header" /></title>
<header id="header">
	<h1>
		<a class="logo" href="<c:url value="home"/>"> <img
			src="assets/img/dxc-logo.png" alt="dxc logo" width="20%" height="60px" />
		</a>
	</h1>
</header>