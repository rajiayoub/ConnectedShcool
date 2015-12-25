<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<ui:panel title="ELEVES" columnWidth="12" >
 		 <form:form id="form-eleve" class="ajaxform" action="eleve/create" method="post" name="eleve">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Code etudient</label>
                      <input type="text" name="codeEleve" class="form-control" id="name" placeholder=" code Eleve">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1"> CNE </label>
                      <input type="text" name="codeNationalEtudiant" class="form-control" id="codeNationalEtudiant" placeholder="code National de l'Etudiant">
                    </div>
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
 	</ui:panel>

</body>

</html>

