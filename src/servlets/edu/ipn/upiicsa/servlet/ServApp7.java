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

		String	expSQL;			// el query que vamos a ejecutar
		int		tenID,			// llave primaria de la BD
				tenJG,			// juegos ganados
				tenJP,			// juegos perdidos
				tenJJ,			// juegos totales: este sera un campo calculado...
				tenPEP,			// porcentaje eficiencia pasto
				tenPEA,			// porcentaje eficiencia arcilla
				tenPES;			// porcentaje eficiencia sintetico
		String	tenNombre,		// nombre del jugador
				tenApellido;	// apellido del jugador

		try{

					Class.forName("com.mysql.jdbc.Driver").newInstance();

						// OJO: La BD llamada "torneotenis" esta almacenada en la carpeta repositoro
						//    El conector a mysql se pued obtener en http://www.mysql.com/products/connector/
						// (en mi caso  mysql-connector-java-5.1.18-bin.jar)
					   //     se debe colocar el subdirectorio lib de apache-tomcat7.0
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/torneotenis","root","makingdevs");
             // ************    Conexion exitosa
			// *************   crea declaracion
			Statement estSQL = conex.createStatement();
			expSQL = "SELECT * FROM Tenistas;";
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
				tenID = rs1.getInt(1);
				tenNombre = rs1.getString(2);
				tenApellido = rs1.getString(3);
				tenJG = rs1.getInt(4);
				tenJP = rs1.getInt(5);
				tenJJ = tenJG + tenJP; // calculamos el total de juegos
				tenPEP = rs1.getInt(6);
				tenPEA = rs1.getInt(7);
				tenPES = rs1.getInt(8);

				// ahora, el envoltorio...
				salida.println("<td>"+tenID+"</td>");
				salida.println("<td>"+tenNombre+"</td>");
				salida.println("<td>"+tenApellido+"</td>");
				salida.println("<td>"+tenJG+"</td>");
				salida.println("<td>"+tenJP+"</td>");
				salida.println("<td>"+tenJJ+"</td>");
				salida.println("<td>"+tenPEP+"</td>");
				salida.println("<td>"+tenPEA+"</td>");
				salida.println("<td>"+tenPES+"</td>");

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
