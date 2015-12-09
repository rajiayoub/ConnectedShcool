<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:if test="${not empty etablissements}">
	<div class="row">
	<div class="col-xs-12">
	<div class="box">
	<div class="box-header">
	<h3 class="box-title">Responsive Hover Table</h3>
	<div class="box-tools"></div>
	</div>
	<!-- /.box-header -->
	<div class="box-body table-responsive no-padding">
	<table class="table table-hover">
		<tbody>
			<tr>
				<th><c:out value="${etablissement.lastName}" /></th>
				<th><c:out value="${etablissement.firstName}" /></th>
				<th>Date</th>
				<th>Status</th>
				<th>Reason</th>
			</tr>
			<c:forEach items="${etablissements}" var="etablissement">


				<tr>
					<td>183</td>
					<td>John Doe</td>
					<td>11-7-2014</td>
					<td><span class="label label-success">Approved</span></td>
					<td>Bacon ipsum dolor sit amet salami venison chicken flank
					fatback doner.</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	<!-- /.box-body --></div>
	<!-- /.box --></div>
	</div>


</c:if>
<c:if test="${empty etablissements}">
	<p><spring:message code="person.list.page.label.no.persons.found" />
	</p>
</c:if>