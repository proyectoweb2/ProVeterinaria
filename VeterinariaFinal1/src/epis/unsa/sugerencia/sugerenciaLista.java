package epis.unsa.sugerencia;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class sugerenciaLista extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Sugerencia.class);
		q.setFilter("sdoc == sdocParam");
		q.declareParameters("String sdocParam");
		
		out.println("<html>"+
					"<head>"+
				"<link type='text/css' href='admin.css' rel='stylesheet'>"+
				"</head>"+
				"<body bgcolor=#00FFFF>"+
				"<div>"+
				"<center>"+
				"<u><h1>Registrados</h1></u>"+
				"<br><br>"+
				"<h2>"+
				"<table border = '2' bgcolor='white'>"+
				"<tr>"+
				  "<td><strong><center><font size=4 color='white'>___</font>Nº<font size=4 color='white'>___</font><center></strong></td>"+
				  "<td><strong><center>Nombre</center></strong></td>"+
				  "<td><strong><center>Sugerencia</center></strong></td>"+
				"</tr>");

		
		try{
			List<Sugerencia> personas = (List<Sugerencia>) q.execute("Sugerencia");
			for(Sugerencia p: personas){
				out.print("<tr>");
				out.println(p);
			}
			out.println("</tr>");
		}catch(Exception e){
			
		}
		finally{
			 q.closeAll();
		}
		out.println(
				"</table>"+
				"</h2>"+
				"</center>"+
				"<br>"+
				
				
				
				"<P ALIGN=left>"+
				"<form action='sugerenciaborrar' method='get'>"+
				"<legend><h3><font color='blue'>Eliminar 'Sugerencia'</font></h3></legend>"+
				"<input type='number' size='20' name='num' placeholder='Numero de comentario' value=''>"+
				"<input type='submit' value='Eliminar'>"+
				"</p>"+
				
				
				"<center>"+
				"<br><br>"+
				"<table border = '2' bgcolor='#81BEF7'>"+
				"<tr>"+
					"<td><a href='indiceSugerencia.html'>Regresar</a></td>"+
				"</tr>"+
				"</table>"+
				
				"</font>"+
				"</center>"+
				"</div>"+
				"</body>"+
				"</html>");
	}
}