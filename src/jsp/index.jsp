<!--	Curso servlets				-->
<!--	Pr�ctica  - Programa originador de	-->
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
<h1> Agregando Nuevo Usuario </h1>
<hr />
<!-- La accion de la forma no esta establecida -->
<!-- Si no se modifica se regresa a la raiz del Contenedor -->
<form action="http://localhost:8080/ServApp7/ServApp7" method="post">
<br />
Agregando Datos
<br />
<label for="">Id Medico</label>
<input type="text" id="id_medico" name="id_medico">
<br/>
<label for="">Nombre</label>
<input type="text" id="name" name="name">
<br/>
<label for="">Paterno</label>
<input type="text" id="ap_mat" name="ap_mat">
<br/>
<label for="">Materno</label>
<input type="text" id="especialidad" name="especialidad">
<br/>
<label for="">Cedula</label>
<input type="text" id="cedula" name="cedula">
<br/>
<label for="">Institucion</label>
<input type="text" id="tipo_institucion" name="tipo_institucion">
<br/>
<label for="">Unidad</label>
<input type="text" id="unidad_admin" name="unidad_admin">
<br/>
<label for="">Area</label>
<input type="text" id="area" name="area">
<br/>
<label for="">Email</label>
<input type="text" id="email" name="email">
<br/>
<label for="">telefono</label>
<input type="text" id="telefono" name="telefono">
<br/>
<label for="">contrasena</label>
<input type="text" id="contrasena" name="contrasena">
 <br />
<input type="submit" value="Guardar" />
</form>
<hr />

</body>
</html>
