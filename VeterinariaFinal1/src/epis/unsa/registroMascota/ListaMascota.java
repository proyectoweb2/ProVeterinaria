package epis.unsa.registroMascota;

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
public class ListaMascota extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		Query q = pm.newQuery(Mascota.class);
		q.setFilter("especie == especieParam");
		q.declareParameters("String especieParam");
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
			  "<td><strong>especie</strong></td>"+
			  "<td><strong>edad</strong></td>"+
			  "<td><strong>sexo</strong></td>"+
			  "<td><strong>mensaje</strong></td>");
		
		
		try{
			List<Mascota> personas = (List<Mascota>) q.execute();
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("perro");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("gato");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("roedores");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("aves");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("peces");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("reptiles");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("anfibios");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		q.setFilter("edad == edadParam");
		q.declareParameters("String edadParam");
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("pqñ");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
		
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("jvn");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
		
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("acn");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		q.setFilter("sexo == sexoParam");
		q.declareParameters("String sexoParam");
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("h");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
		
		}catch(Exception e){
			
		}
		try{
			List<Mascota> personas = (List<Mascota>) q.execute("m");
			for(Mascota p: personas){
				out.print("<tr>");
				out.println(p+" ");
			}
			out.println("</tr>");
			
		}catch(Exception e){
			
		}
		finally{
			 q.closeAll();
		}
		
	}
}