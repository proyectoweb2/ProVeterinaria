package epis.unsa.registroCliente;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.SendResponse;

@SuppressWarnings("serial")
public class CrearPersona extends HttpServlet{

	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {

		PersistenceManager pm = PMF.get().getPersistenceManager();

		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String name = req.getParameter("nombre");
		String last = req.getParameter("apellido");
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		String adress = req.getParameter("direccion");
		String phone = req.getParameter("telefono");
		String pet = req.getParameter("pet");
		
		@SuppressWarnings("unused")
		RequestDispatcher rd = null;
		Persona user = new Persona (name,last,username,pass,adress,phone,pet);

		try {
			pm.makePersistent(user);
			//rd = req.getRequestDispatcher("/listaPersona.jsp");
			//rd.forward(req, resp);
			resp.getWriter().println(name + " Grabado correctamente");
			resp.setHeader("Refresh", "1; url= menuinicio.html");
		}
		catch (Exception e){
			System.out.println(e);
			out.println("Noooo");

		}
	}
}