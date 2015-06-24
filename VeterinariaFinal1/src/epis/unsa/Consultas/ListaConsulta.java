package epis.unsa.Consultas;

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
public class ListaConsulta extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Consulta.class);
		out.println("<html>"+
				"<head>"+
			"<link type='text/css' href='admin.css' rel='stylesheet'>"+
			"</head>"+
			"<body bgcolor=#00FFFF>"+
			"<a href='indiceAdmin.html'>atras</a>"+
			"<div>"+
			"<center>"+
			"<u><h1>Registrados</h1></u>"+
			"<br><br>"+
			"<h2>"+
			"<table border = '3' bgcolor='white'>"+
			"<tr>"+
			  "<td><strong>nombre </strong></td>"+
			  "<td><strong>apellido</strong></td>"+
			  "<td><strong>correo</strong></td>"+
			  "<td><strong>consulta</strong></td>");
		
		try{
			List<Consulta> personas = (List<Consulta>) q.execute();
			for(Consulta p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			out.println("/n");
		}catch(Exception e){
			
		}
		finally{
			 q.closeAll();
		}
		
	}
}