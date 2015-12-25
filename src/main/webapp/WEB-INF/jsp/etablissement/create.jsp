<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<ui:panel title="ETABLISSEMENTS" columnWidth="12" >
 		 <form:form id="form-etablissement" class="ajaxform" action="etablissement/create" method="post" name="etablissement">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Etablissement name</label>
                      <input type="text" name="name" class="form-control" id="name" placeholder="Etablissement name">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Etablissement Adresse</label>
                      <input type="text" name="adresse" class="form-control" id="adresse" placeholder="Etablissement Adresse">
                    </div>
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
 	</ui:panel>

</body>

</html>

