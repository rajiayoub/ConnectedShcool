<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<ui:panel title="Profils" columnWidth="12" >
 		 <form:form id="form-profil" class="ajaxform" action="profil/create" method="post" name="profil">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Profil libelle</label>
                      <input type="text" name="loginUser" class="form-control" id="name" placeholder="Profil libelle">
                    </div>
                    
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
 	</ui:panel>

</body>

</html>
