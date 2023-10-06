<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="common-in-head.jsp"/>
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="header.jsp"/>
		<h2>Formulario Alta de Categoría</h2>
		<form:form action="alta-categoria" method="POST" modelAttribute="categoria">
		<table>
			<tr>
				<td>Nombre</td>
				<td><form:input path="nombre"/></td>	
			</tr>
		</table>
		<form:button>CREAR</form:button>
		</form:form>
	</div>
</body>
</html>