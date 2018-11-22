<!--	Curso servlets				-->
<!--	Práctica  - Programa originador de	-->
<!--		      la solicitud (request)	-->
<!--		      publicado desde ANT	-->
<!--	Modificado:   @FECHA@ a las @HORA@	-->
<!--						-->

<%@ page session="true" %>
<%@ page language="java" %>
<%@ page contentType="text/html" %>


<html>
<head>
<title>Este es el archivo index jsp</title>
</head>
<body>
<h1> Archivo index.jsp - ServApp7 </h1>
<hr />
<!-- La accion de la forma no esta establecida -->
<!-- Si no se modifica se regresa a la raiz del Contenedor -->
<form action="http://localhost:8080/" method="get">
<br />
El esqueleto de web-app no hace cosa alguna. Hay que agregarle funcionalidad. <br />
Selecciona una opci&oacute;n: <br />
<input type="radio" name="indicador" value="uno">Valor #1<br />
<input type="radio" name="indicador" value="dos">Valor #2<br />
<input type="radio" name="indicador" value="tres">Valor #3<br />
<input type="radio" name="indicador" value="cuatro">Valor #4<br />

Asi que continua: <br />
<input type="submit" value="Haciendo click" />
</form>
<hr />

</body>
</html> 
