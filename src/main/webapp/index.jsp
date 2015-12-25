<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="WEB-INF/jsp/layout/main.jsp" />

<html>
<body class="layout-boxed sidebar-mini skin-black">
<!-- Site wrapper -->
<div class="wrapper"><header class="main-header"> <!-- Logo -->
<a href="../../index2.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
<span class="logo-mini"><b>A</b>LT</span> <!-- logo for regular state and mobile devices -->
<span class="logo-lg"><b>Admin</b>LTE</span> </a> <!-- Header Navbar: style can be found in header.less -->
<nav class="navbar navbar-static-top" role="navigation"> <!-- Sidebar toggle button-->
<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
<span class="icon-bar"></span> <span class="icon-bar"></span> </a>
<div class="navbar-custom-menu">
<ul class="nav navbar-nav">
	<!-- Messages: style can be found in dropdown.less-->
	<li class="dropdown messages-menu"><a href="#"
		class="dropdown-toggle" data-toggle="dropdown"> <i
		class="fa fa-envelope-o"></i> <span class="label label-success">4</span>
	</a>
	<ul class="dropdown-menu">
		<li class="header">You have 4 messages</li>
		<li class="footer"><a href="#">See All Messages</a></li>
	</ul>
	</li>
	<!-- Notifications: style can be found in dropdown.less -->
	<li class="dropdown notifications-menu"><a href="#"
		class="dropdown-toggle" data-toggle="dropdown"> <i
		class="fa fa-bell-o"></i> <span class="label label-warning">10</span>
	</a>
	<ul class="dropdown-menu">
		<li class="header">You have 10 notifications</li>
		<li class="footer"><a href="#">View all</a></li>
	</ul>
	</li>
	<!-- Tasks: style can be found in dropdown.less -->
	<li class="dropdown tasks-menu"><a href="#"
		class="dropdown-toggle" data-toggle="dropdown"> <i
		class="fa fa-flag-o"></i> <span class="label label-danger">9</span> </a></li>
	<!-- User Account: style can be found in dropdown.less -->
	<li class="dropdown user user-menu"><a href="#"
		class="dropdown-toggle" data-toggle="dropdown"> <img
		src="<c:url value="/resources/dist/img/user2-160x160.jpg"/>"
		class="user-image" alt="User Image"> <span class="hidden-xs">Alexander
	Pierce</span> </a>
	<ul class="dropdown-menu">
		<!-- User image -->
		<li class="user-header"><img
			src="<c:url value="/resources/dist/img/user2-160x160.jpg"/>"
			class="img-circle" alt="User Image">
		<p>Alexander Pierce - Web Developer <small>Member since
		Nov. 2012</small></p>
		</li>
		<!-- Menu Body -->
		<li class="user-body">
		<div class="col-xs-4 text-center"><a href="#">Followers</a></div>
		<div class="col-xs-4 text-center"><a href="#">Sales</a></div>
		<div class="col-xs-4 text-center"><a href="#">Friends</a></div>
		</li>
		<!-- Menu Footer-->
		<li class="user-footer">
		<div class="pull-left"><a href="#"
			class="btn btn-default btn-flat">Profile</a></div>
		<div class="pull-right"><a href="#"
			class="btn btn-default btn-flat">Sign out</a></div>
		</li>
	</ul>
	</li>
	<!-- Control Sidebar Toggle Button -->
	
	<li class="dropdown" id="loader-el" ><img
		src="<c:url value="/resources/dist/img/loader/500 (3).GIF" />" /></li>
</ul>

</div>
</nav> </header> <!-- =============================================== --> <!-- Left side column. contains the sidebar -->
<aside class="main-sidebar"> <!-- sidebar: style can be found in sidebar.less -->
<div class="slimScrollDiv"
	style="position: relative; overflow: hidden; width: auto; height: 270px;"><section
	class="sidebar" style="height: 270px; overflow: hidden; width: auto;">
<!-- Sidebar user panel -->
<div class="user-panel">
<div class="pull-left image"><img
	src="<c:url value="/resources/dist/img/user2-160x160.jpg"/>"
	class="img-circle" alt="User Image"></div>
<div class="pull-left info">
<p>Alexander Pierce</p>
<a href="#"><i class="fa fa-circle text-success"></i> Online</a></div>
</div>
<!-- search form -->
<form action="#" method="get" class="sidebar-form">
<div class="input-group"><input type="text" name="q"
	class="form-control" placeholder="Search..."> <span
	class="input-group-btn">
<button type="submit" name="search" id="search-btn" class="btn btn-flat"><i
	class="fa fa-search"></i></button>
</span></div>
</form>
<!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->
<ul class="sidebar-menu">
	<li class="header">MAIN NAVIGATION</li>
	<li class="treeview"><a href="etablissement/list" class="ajaxlink">
	<i class="fa fa-fw fa-bank"></i> Etablissement </a></li>
	<li class="treeview"><a href="professeur/list" class="ajaxlink">
	<i class="fa fa-fw fa-bank"></i> Professeur </a></li>
	<li class="treeview"><a href="eleve/list" class="ajaxlink">
	<i class="fa fa-fw fa-bank"></i> Eleve </a></li>

</ul>
</section> </aside> <!-- =============================================== --> <!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">

<div id="container" style="padding: 10px;">
xqq
</div>
</div>
<!-- ./wrapper -->
</body>
</html>