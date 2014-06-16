<%-- 
    Document   : index
    Created on : 4-jun-2014, 15:32:56
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="auto.AutoOverzicht"%>

<%
	AutoOverzicht auto = new AutoOverzicht();
	String printoverzicht = "";
	String auto1 = "";
	String auto2 = "";
	int max = 0;
	int min = 0;

	auto1 = auto.getAutoLijst();

	try {

		if (request.getParameter("merk") != null) {
			auto2 = request.getParameter("auto");
			if (auto2.equals("Alle merken")) {
				printoverzicht = auto.getAlles();

			} else {
				printoverzicht = auto.getMerk(auto2);

			}
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
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">

<link href="css/bootstrap-theme.min.css" rel="stylesheet"
	type="text/css">
<script src="js/bootstrap.min.js"></script>
<link href="Style.css" rel="stylesheet" type="text/css">

<title>Formulier</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

<script>
	$(function() {
		$("#slider-range").slider({
			range : true,
			min : 0,
			max : 209000,
			values : [ 0, 209000 ],
			slide : function(event, ui) {
				$("#amount").val("" + ui.values[0] + " - " + ui.values[1]);
				$("#min").val("" + ui.values[0]);
				$("#max").val("" + ui.values[1]);
			}
		});
		$("#amount").val(
				"" + $("#slider-range").slider("values", 0) + " - "
						+ $("#slider-range").slider("values", 1));
	});
</script>


</head>
<body>
	<div class="container">
		<div class="alert alert-info" STYLE="text-align: center;">
			<h1>Formulier</h1>

		</div>

		<form class="slider1" method="get" action="form.jsp">

			<label for="amount">Zoek op prijs:</label> <input type="text"
				name="amount" id="amount"
				style="border: 0; color: #f6931f; font-weight: bold;">
		</form>
		<div id="slider-range"></div>
		<form method="get">
			<input type="hidden" name="min" id="min"> 
			<input type="hidden" name="max" id="max"> <br /> 
			<input class="btn btn-danger" type="submit" name="prijs" />




		</form>


		<h2>Zoek op merk</h2>
		<form method="get">
			<label>Selecteer de naam van een merk zodat alle auto's van
				dat merk word weer gegeven <select class="dropdown form-control"
				name="auto">
					<%=auto1%>

			</select>
			</label> <br/> <br/> <input class="btn btn-primary" type="submit"
				value="Zoeken op merk" name="merk">
		</form>

	</div>
	<div>
		<a href="index.jsp"><h3>Terug naar home</h3></a>
	</div>

	<div class="clearfix">
		<%=printoverzicht%>
	</div>
	</body>
</html>
