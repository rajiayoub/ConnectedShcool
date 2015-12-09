<%@taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="col-md-4">
<div class="box box-primary">
<div class="box-header with-border">
<h3 class="box-title">Etablissement Setting</h3>
</div>
 <ui:entityForm className="com.connected.school.dto.PersonneDTO" model="personne" /></div>
</div>


</body>
</html>