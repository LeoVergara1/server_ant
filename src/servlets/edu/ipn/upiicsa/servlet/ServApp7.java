package	edu.ipn.upiicsa.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *	<p>
 *	Clase principal del servlet.
 *	</p>
 *
 *	@author		ABM
 *	@version	1.0
 */
public class ServApp7 extends HttpServlet {

	/**
	 *
	 *
	 */
    public void doGet(HttpServletRequest peticion, HttpServletResponse response)
    throws IOException, ServletException
    {
		// establece la manija al dispositivo que escribe al cliente
        response.setContentType("text/html");
        PrintWriter salida = response.getWriter();

				String	expSQL;
				int		id_medico;
				String	nombre,
						ap_pat,
						ap_mat,
						especialidad,
						cedula,
						unidad_admin,
						area,
						email,
						telefono,
						contrasena;

		try{

					Class.forName("com.mysql.jdbc.Driver").newInstance();

						// OJO: La BD llamada "torneotenis" esta almacenada en la carpeta repositoro
						//    El conector a mysql se pued obtener en http://www.mysql.com/products/connector/
						// (en mi caso  mysql-connector-java-5.1.18-bin.jar)
					   //     se debe colocar el subdirectorio lib de apache-tomcat7.0
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/eqe","root","makingdevs");
             // ************    Conexion exitosa
			// *************   crea declaracion
			Statement estSQL = conex.createStatement();
			expSQL = "SELECT * FROM medicos;";
			// ************   Intenta ejecutar consulta
			ResultSet rs1 = estSQL.executeQuery(expSQL);
			// ***********  Consulta ejecutada

			// avisa que vamos a comenzar a sacar datos: ENCABEZADO

			salida.println("<h1>Base de Datos: TorneoTenis</h1>");
			salida.println("<h1>Esta aplicacion solo demuestra la conexion a una Base de Datos</h1>");
			salida.println("<h1>No utiliza el patron de diseno MVC</h1>");
			salida.println("<h2>Tabla: tenistas</h2>");
			salida.println("<h3>Consulta generica</h3>");
			salida.println("<hr size=3 color=red><br>");
			salida.println("<table border=1>");
			salida.println("<th>ID</th>");
			salida.println("<th>Nombre</th>");
			salida.println("<th>Apellido</th>");
			salida.println("<th>JP</th>");
			salida.println("<th>JG</th>");
			salida.println("<th>JJ</th>");
			salida.println("<th>%Ef.Arcilla</th>");
			salida.println("<th>%Ef.Pasto</th>");
			salida.println("<th>%Ef.Sint&eacute;tico</th>");
			salida.println("<tr>");

			// extrae todos los datos con un cursor...
			// y envuelvelos con HTML
			while (rs1.next()) {
				id_medico = rs1.getInt(1);
				nombre = rs1.getString(2);
				ap_pat = rs1.getString(3);
				ap_mat = rs1.getString(4);
				especialidad = rs1.getString(5);
				cedula = rs1.getString(6);
				unidad_admin = rs1.getString(7);
				area = rs1.getString(8);
				email = rs1.getString(9);
				telefono =rs1.getString(10);
				contrasena = rs1.getString(11);

				// ahora, el envoltorio...
				salida.println("<td>"+id_medico+"</td>");
				salida.println("<td>"+nombre+"</td>");
				salida.println("<td>"+ap_pat+"</td>");
				salida.println("<td>"+ap_mat+"</td>");
				salida.println("<td>"+especialidad+"</td>");
				salida.println("<td>"+cedula+"</td>");
				salida.println("<td>"+unidad_admin+"</td>");
				salida.println("<td>"+area+"</td>");
				salida.println("<td>"+email+"</td>");
				salida.println("<td>"+telefono+"</td>");
				salida.println("<td>"+contrasena+"</td>");

				// seguimos al siguiente renglon, si lo hay
				salida.println("<tr>");

			} // end while

			// terminamos la tabla...
			salida.println("</table><br>");

			estSQL.close();	// cierra la conexion con la BD
			conex.close();	// y cierra la conexion con el driver

		} catch (Exception laFalla) {
			System.out.println(laFalla.getMessage());
			salida.println(laFalla.getMessage());
		salida.println("Esta fallando");
		} // end try
		salida.println("laFalla.getMessage()");

    } // fin doGet

} // fin ServApp7
