<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="/WEB-INF/views/client/taglib.jsp"%>

<link href="<c:url value="/assets/style.css" />" rel="stylesheet" />
<link href="<c:url value="/assets/inquiryForm.css" />" rel="stylesheet" />

<div style="height: 30px; background-color: darkcyan;"></div>

<div style="margin-bottom: 100px; margin-top: 30px;">

	<form th:action="/inquireClientRequest" method="POST">
		<input type="text" placeholder="Client Number For Search"
			name="clientId" style="margin: 0; height: 25px;"> <input
			type="submit" value="Inquire" />
	</form>
	<c:if test="${clientDto != null }">
		<table>
			<tr>
				<td><spring:message code="lbl.clientId" /></td>
				<td><spring:message code="lbl.firstName" /></td>
				<td><spring:message code="lbl.lastName" /></td>
				<td><spring:message code="lbl.gender" /></td>
				<td><spring:message code="lbl.dateOfBirth" /></td>
				<td><spring:message code="lbl.identityNumber" /></td>
				<td><spring:message code="lbl.maritalStatus" /></td>
				<td><spring:message code="lbl.address" /></td>
				<td><spring:message code="lbl.country" /></td>
			</tr>

			<tr>
				<td>${clientDto.clientID}</td>
				<td>${clientDto.firstName}</td>
				<td>${clientDto.lastName}</td>
				<td>${clientDto.gender}</td>
				<td>${clientDto.dateOfBirth}</td>
				<td>${clientDto.identityNumber}</td>
				<td>${clientDto.marital}</td>
				<td class="address_col">${clientDto.address}</td>
				<td>${clientDto.country}</td>

			</tr>
		</table>
	</c:if>
	<c:if test="${clientDto == null && clientId ne '' && clientId ne null}">
		<p>Client with the Client Number = '${ clientId}' not found</p>
	</c:if>
	<c:if test="${clientId eq '' || clientId eq null}">
		<p><spring:message code="warning.notInput" /></p>
	</c:if>
</div>