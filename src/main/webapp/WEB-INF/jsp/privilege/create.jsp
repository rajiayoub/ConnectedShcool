<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<ui:panel title="Privileges" columnWidth="12" >
 		 <form:form id="form-privilege" class="ajaxform" action="privilege/create" method="post" name="privilege">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">Privilege libelle</label>
                      <input type="text" name="libellePrivilege" class="form-control" id="name" placeholder="Privilege libelle">
                    </div>
                    
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
 	</ui:panel>

</body>

</html>
