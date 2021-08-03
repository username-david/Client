<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/views/client/taglib.jsp"%>

<html>
<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<link href="<c:url value="/assets/style.css" />" rel="stylesheet" />
</head>

<body>
	<!-- <%-- Color bar. --%> -->
	<div style="height: 30px; background-color: darkcyan;"></div>
	
	<h1 id="page_name">Client adding form</h1>
	<div id="whole">

		<form:form method="POST" action="addClientRequest"
			modelAttribute="client">
			<table>
				<tr>
					<td><label class="required"><spring:message code="lbl.firstName" /></label></td>
					<td><form:input type="text" path="firstName" id="same_width"
							/></td>
				</tr>
				<tr>
					<td><label class="required"><spring:message code="lbl.lastName" /></label></td>
					<td><form:input type="text" path="lastName" id="same_width"
							required="required"  /></td>
				</tr>
				<tr>
					<td id="top_left"><label class="required"><spring:message code="lbl.gender" /></label></td>
					<td><form:select path="genderId" id="genders"
							>
							<c:forEach var="item" items="${genders}">
								<option value="${item.id }">${item.genderSymbol}</option>
							</c:forEach>
						</form:select></td>
				</tr>
				<tr>
					<td><label><spring:message code="lbl.dateOfBirth" /></label></td>
					<td><form:input type="date" path="dateOfBirth" id="same_width"
							 required="required" /></td>
				</tr>
				<tr>
					<td><label><spring:message code="lbl.identityNumber" /></label></td>
					<td><form:input type="text" path="identityNumber"
							id="same_width" 
							required="required" /></td>
				</tr>
				<tr>
					<td id="top_left"><label class="required"><spring:message code="lbl.maritalStatus" /></label></td>
					<td><form:select path="maritalId" id="martialStates">
							<c:forEach var="marital" items="${maritals}">
								<option value="${marital.id }">${marital.maritalSymbol}</option>
							</c:forEach>
						</form:select></td>
				</tr>
				<tr>
					<td><label><spring:message code="lbl.address" /></label></td>
					<td><form:input type="text" path="address" id="same_width"
							required="required" /></td>
				</tr>
				<tr>
					<td id="top_left"><label class="required"><spring:message code="lbl.country" /></label></td>
					<td><form:select path="countryId" id="countries">
							<c:forEach var="country" items="${countries}">
								<option value="${country.id }">${country.countrySymbol}</option>
							</c:forEach>
						</form:select></td>
				</tr>
				<tr>
					<td colspan="2"><input id="cancel_btn" type="button"
						value="Cancel" onclick="location.href='/home'" /> <input
						id="save_btn" type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>

<script>
	$('#save_btn').click(function() {
		isNameFilled = $("input[name='movieName']").val();
		if (!isNameFilled) {
			alert("You must enter the field!");
			return false;
		}

		checked = $("[name=genres]:checked").length;
		if (!checked) {
			alert("You must select at least one genre!");
			return false;
		}

		return confirm('Please confirm: OK to continue, Cancel to abort.')
	});
</script>