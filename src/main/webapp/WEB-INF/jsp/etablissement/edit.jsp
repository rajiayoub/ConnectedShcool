<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
</head>
<body>
<jsp:include page="navigation.jsp" />
<h1><spring:message code="person.edit.page.title" /></h1>
<div><c:if test="${feedbackMessage != null}">
	<div class="messageblock"><c:out value="${feedbackMessage}" /></div>
</c:if> <c:if test="${errorMessage != null}">
	<div class="errorblock"><c:out value="${errorMessage}" /></div>
</c:if> <form:form action="/ConnectedShcool/etablissement/edit" commandName="etablissement" method="POST">
	<form:hidden path="id" />
	<div><form:label path="firstName">
		<spring:message code="person.label.firstName" />:</form:label> <form:input
		path="firstName" cssClass="form-control" size="20" /> <form:errors path="firstName"
		cssClass="error" element="div" /></div>
	<div><form:label path="lastName">
		<spring:message code="person.label.lastName" />:</form:label> <form:input
		path="lastName" cssClass="form-control" size="20" /> <form:errors path="lastName"
		cssClass="error" element="div" /></div>
	<div><input type="submit"
		value="<spring:message code="person.edit.page.submit.label"/>" /></div>
</form:form></div>
</body>
</html>