package epis.unsa.publicacion;


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
public class publicacionLista extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Publicacion.class);
		q.setFilter("pdoc == pdocParam");
		q.declareParameters("String pdocParam");
		
		out.println("<html>"+
					"<head>"+
				"<link type='text/css' href='admin.css' rel='stylesheet'>"+
				"</head>"+
				"<body bgcolor=#00FFFF>"+
				"<div>"+
				"<center>"+
				"<u><h1>PUBLICACIONES</h1></u>"+
				"<br><br>"+
				"<h2>"+
				"<table border = '2' bgcolor='white'>");

		
		try{
			List<Publicacion> personas = (List<Publicacion>) q.execute("Publicacion");
			for(Publicacion p: personas){
				out.print("<tr>");
				out.println(p);
			}
			out.println("</tr>");
		}
		catch(Exception e){
			
		}
		finally{
			 q.closeAll();
		}
		out.println(
				"</table>"+
				"</h2>"+
				"</center>"+
				"<br>"+
				
				
				"<center>"+
				"<br><br>"+
				"<table border = '2' bgcolor='#81BEF7'>"+
				"<tr>"+
					"<td><a href='menuinicio.html'>Regresar</a></td>"+
				"</tr>"+
				"</table>"+
				
				"</font>"+
				"</center>"+
				"</div>"+
				"</body>"+
				"</html>");
	}
}