<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<ui:panel title="PROFESSEUR" columnWidth="12" >
 		 <form:form id="form-etablissement" class="ajaxform" action="professeur/create" method="post" name="professeur">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Matricule</label>
                      <input type="text" name="matricule" class="form-control" id="name" placeholder="Matricule professeur">
                    </div>
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Nom </label>
                      <input type="text" name="firstName" class="form-control" id="name" placeholder="Nom professeur">
                    </div>
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Type contrat :</label>
                      <input type="checkbox" name="permanent" class="form-control" id="permanant" >
                      <input type="radio" name="id" value=".NET"> .NET<BR>
                    </div>
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
 	</ui:panel>

</body>

</html>

