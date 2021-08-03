<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title><decorator:title default="Home Page" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href="<c:url value="/assets/css/bootstrap.css" />"
	rel="stylesheet" />
<!-- Customize styles -->
<link href="<c:url value="/assets/style.css" />" rel="stylesheet" />
<!-- font awesome styles -->
<link href="<c:url value="/assets/font-awesome/css/font-awesome.css" />"
	rel="stylesheet">

<link rel="shortcut icon"
	href="<c:url value="/assets/ico/favicon.ico" />">
</head>
<body>
	<!-- 
	Upper Header Section 
-->
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="topNav">
			<div class="container">
				<div class="alignR">
					<div class="pull-left socialNw">
						<a href="#"><span class="icon-facebook"></span></a> <a href="#"><span
							class="icon-pinterest"></span></a> <a href="#"><span
							class="icon-linkedin"></span></a>
					</div>
					<a class="active" href="index.html"> <span class="icon-home"></span>
						Home
					</a> <a href="#"><span class="icon-user"></span> My Account</a> <a
						href="contact.html"><span class="icon-envelope"></span>
						Contact us</a>
				</div>
			</div>
		</div>
	</div>

	<!--
Lower Header Section 
-->
	<div class="container">
		<div id="gototop"></div>
		<%@include file="/WEB-INF/views/layouts/header.jsp"%>

		<!--
Navigation Bar Section 
-->
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<a data-target=".nav-collapse" data-toggle="collapse"
						class="btn btn-navbar"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
					</a>
					<div class="nav-collapse">
						<ul class="nav">
							<li class="active"><a href="<c:url value="/home"/>">Home</a></li>
							<li class=""><a href="<c:url value="addClientRequest"/>">Add Client</a></li>
							<li class=""><a href="<c:url value="modifyClientRequest"/>">Modify
									Client</a></li>
							<li class=""><a href="<c:url value="inquireClientRequest"/>">Inquire
									Client</a></li>
						</ul>
						<form action="#" class="navbar-search pull-left"
							style="margin-left: 170px;">
							<input type="text" placeholder="Search"
								class="search-query span2">
						</form>
						<ul class="nav pull-right">
							<li class="dropdown"><a data-toggle="dropdown"
								class="dropdown-toggle" href="#"><span class="icon-lock"></span>
									Login <b class="caret"></b></a>
								<div class="dropdown-menu">
									<form class="form-horizontal loginFrm">
										<div class="control-group">
											<input type="text" class="span2" id="inputEmail"
												placeholder="Email">
										</div>
										<div class="control-group">
											<input type="password" class="span2" id="inputPassword"
												placeholder="Password">
										</div>
										<div class="control-group">
											<label class="checkbox"> <input type="checkbox">
												Remember me
											</label>
											<button type="submit" class="shopBtn btn-block">Sign
												in</button>
										</div>
									</form>
								</div></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<decorator:body />

		<hr class="soften" />

		<%@include file="/WEB-INF/views/layouts/footer.jsp"%>

	</div>
	<!-- /container -->

	<%@include file="/WEB-INF/views/layouts/copyright.jsp"%>

	<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="<c:url value="/assets/js/jquery.js" />"></script>
	<script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/assets/js/jquery.easing-1.3.min.js" />"></script>
	<script
		src="<c:url value="/assets/js/jquery.scrollTo-1.4.3.1-min.js" />"></script>
	<script src="<c:url value="/assets/js/shop.js" />"></script>
</body>
</html>