<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld"%>
<%@page isELIgnored="false"%>
<html>
<head>
</head>
<body>
<ui:row>

	<ui:panel title="ETABLISSEMENTS" columnWidth="8">
		<ui:actions>
			<ui:action label="Nouvelle etablissement" href="etablissement/create"
				icon="fa-plus"></ui:action>
		</ui:actions>
		<ui:body>
			<ui:list>
				<c:forEach items="${etablissements}" var="etablissement">
					<li class=""><span class="handle"> <i
						class="fa fa-angle-double-right"></i> </span> <!-- checkbox --> <!-- todo text -->
					<span class="text"><c:out value="${etablissement.name}"></c:out></span>
					
					<div class="tools"><i class="fa fa-edit"></i> <i
						class="fa fa-trash-o"></i></div>
					</li>
				</c:forEach>
			</ui:list>


		</ui:body>

	</ui:panel>
	<ui:panel title="Informations générales" columnWidth="4">
		<ui:actions>

		</ui:actions>
		<ui:body>
			<div class="box-body box-profile"><img
				class="profile-user-img img-responsive img-circle"
				src="<c:url value="/resources/dist/img/user2-160x160.jpg"/>"
				alt="User profile picture">
			<h3 class="profile-username text-center">Nina Mcintire</h3>
			<p class="text-muted text-center">Software Engineer</p>

			<ul class="list-group list-group-unbordered">
				<li class="list-group-item"><b>Followers</b> <a
					class="pull-right">1,322</a></li>
				<li class="list-group-item"><b>Following</b> <a
					class="pull-right">543</a></li>
				<li class="list-group-item"><b>Friends</b> <a
					class="pull-right">13,287</a></li>
			</ul>

			<a href="#" class="btn btn-primary btn-block"><b>Follow</b></a></div>
		</ui:body>
	</ui:panel>

</ui:row>
</body>
</html>