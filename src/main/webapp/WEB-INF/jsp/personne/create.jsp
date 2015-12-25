<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
</head>
<body>

 <div class="col-md-12">
    <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Personne Setting</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                <form:form id="form-personne" class="ajaxForm" name="personne" action="personne/create" method="post">
                  <div class="box-body">
                    <div class="form-group" id="div-field-name">
                      <label for="exampleInputEmail1">Personne first name</label>
                      <label class="control-label" for="name"><i class="fa fa-times-circle-o"></i> Input with error</label>
                      <input type="text" name="firstname" class="form-control" id="name" placeholder="First name">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Personne last name</label>
                      <input type="text" name="lastname" class="form-control" id="adresse" placeholder="Last Adresse">
                    </div>
                   
                  </div><!-- /.box-body -->

                  <div class="box-footer">
                    <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
                </form:form>
              </div>
            </div>
</html>

