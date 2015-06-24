package epis.unsa.producto;

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
public class ProductoLista extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Producto.class);
		//q.setFilter("doc == docParam");
		//q.declareParameters("String docParam");
		
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
				"<table border = '3' bgcolor='white'>"+
				"<tr>"+
				  "<td><strong>Nombre de producto</strong></td>"+
				  "<td><strong>Cantidad</strong></td>"+
				  "<td><strong>Costo</strong></td>");

		
		try{
			List<Producto> personas = (List<Producto>) q.execute("");
			for(Producto p: personas){
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
				"<form action='productoborrar' method='get'>"+
				"<legend><h3><font color='blue'>Eliminar por 'Producto'</font></h3></legend>"+
				"<input type='text' size='20' name='nom' placeholder='nomdre del  producto' value=''>"+
				"<input type='submit' value='Eliminar'>"+
				"</p>"+
				
				
				"<center>"+
				"<br><br>"+
				"<table border = '2' bgcolor='#81BEF7'>"+
				"<tr>"+
					"<td><a href='indiceProducto.html'>Regresar</a></td>"+
				"</tr>"+
				"</table>"+
				
				"</font>"+
				"</center>"+
				"</div>"+
				"</body>"+
				"</html>");
	}
}