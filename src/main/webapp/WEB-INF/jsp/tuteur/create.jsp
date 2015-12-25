<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="ui" uri="/WEB-INF/tags/java-tags-angular.tld" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<ui:panel title="TUTEURS" columnWidth="12" >
 		 <form:form id="form-tuteur" class="ajaxform" action="tuteur/create" method="post" name="tuteur">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="div-field-name">CIN</label>
                      <input type="text" name="cin" class="form-control" id="cin" placeholder="CIN du Tuteur">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Profession</label>
                      <input type="text" name="profession" class="form-control" id="adresse" placeholder="Profession">
                    </div>
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
 	</ui:panel>

</body>

</html>

