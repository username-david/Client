<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="/WEB-INF/views/client/taglib.jsp"%>

<div style="height: 30px; background-color: darkcyan;"></div>

<div style="margin-bottom: 100px; margin-top: 30px;">

	<form th:action="/inquireClientRequest" method="POST">
		<input type="text" placeholder="Client Number For Search"
			name="clientId" style="margin: 0; height: 25px;"> <input
			type="submit" value="Inquire" />
	</form>
</div>

<div>

	<c:set var="client" scope="session" value="${client}" />
	<c:out value="${client}" />

	<form:form method="POST" action="addClientRequest"
		modelAttribute="client">
		<table>
			<tr>
				<td><label class="required"><spring:message
							code="lbl.firstName" /></label></td>
				<td><input type="text" path="firstName" id="same_width"
					required="required" value="${client.firstName }" /></td>
			</tr>
			<tr>
				<td><label class="required"><spring:message
							code="lbl.lastName" /></label></td>
				<td><input type="text" path="lastName" id="same_width"
					required="required" value="${client.lastName }" /></td>
			</tr>
			<tr>
				<td id="top_left"><label class="required"><spring:message
							code="lbl.gender" /></label></td>
				<td><select path="genderId" id="genders">
						<c:forEach var="item" items="${genders}">
							<option value="${item.id }"
								th:selected="${client.getId }">${item.genderSymbol}</option>
							<%-- 							<option value="${item.id }" th:if="${client.genderId ne item.id}">${item.genderSymbol}</option> --%>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><label class="required"><spring:message
							code="lbl.dateOfBirth" /></label></td>
				<td><input type="date" path="dateOfBirth" id="same_width"
					required="required" value="${client.dateOfBirth }" /></td>
			</tr>
			<tr>
				<td><label class="required"><spring:message
							code="lbl.identityNumber" /></label></td>
				<td><input type="text" path="identityNumber" id="same_width"
					required="required" value="${client.identityNumber }" /></td>
			</tr>
			<tr>
				<td id="top_left"><label class="required"><spring:message
							code="lbl.maritalStatus" /></label></td>
				<td><select path="maritalId" id="martialStates">
						<c:forEach var="marital" items="${maritals}">
							<option value="${marital.id }">${marital.maritalSymbol}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><label class="required"><spring:message
							code="lbl.address" /></label></td>
				<td><input type="text" path="address" id="same_width"
					required="required" value="${client.address }" /></td>
			</tr>
			<tr>
				<td id="top_left"><label class="required"><spring:message
							code="lbl.country" /></label></td>
				<td><select path="countryId" id="countries"">
						<c:forEach var="country" items="${countries}">
							<option value="${country.id }">${country.countrySymbol}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input id="cancel_btn" type="button"
					value="Cancel" onclick="location.href='/home'" /> <input
					id="save_btn" type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</div>