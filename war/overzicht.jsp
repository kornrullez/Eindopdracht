<%-- 
    Document   : overzicht
    Created on : 28-mei-2014, 9:20:44
    Author     : Kevin
--%>
<%@page import="auto.AutoOverzicht"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	AutoOverzicht auto = new AutoOverzicht();
	String printoverzicht = "";
	String auto1 = "";
	int max = 0;
	int min = 0;

	try {

		if (request.getParameter("Zoek1") != null) {
			auto1 = request.getParameter("auto");
			printoverzicht = auto.getMerk(auto1);
		}
		if (request.getParameter("Zoek2") != null) {

			printoverzicht = auto.getAlles();
		}

		if (request.getParameter("prijs") != null) {
			min = Integer.parseInt(request.getParameter("min"));
			max = Integer.parseInt(request.getParameter("max"));

			if (min == 0 && max != 0) {
				printoverzicht = auto.maxPrijs(max);
			} else if (min != 0 && max == 0) {
				printoverzicht = auto.minPrijs(min);
			} else if (min != 0 && max != 0) {
				printoverzicht = auto.zoekPrijs(min, max);
			} else if (min == 0 && max == 0) {

			}
		}
	}

	catch (NumberFormatException e) {

	}
%>
<!DOCTYPE html>
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css">
<script src="js/bootstrap.min.js"></script>
<link href="Style.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Zoeken</title>

</head>
<body>
	<div class="container">

		<div class="alert alert-info" STYLE="text-align: center;">
			<h1>Auto overzicht</h1>

		</div>
		<div class="clearfix">

			<%=printoverzicht%>

		
		
		</div>
	
	</div>

	<br> <a href="form.jsp"><h3>formulier</h3></a>
</body>
</html>
