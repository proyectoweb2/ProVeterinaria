package epis.unsa.registroMascota;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;



@SuppressWarnings("serial")
public class SaveMascota extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nombre");
		
		String especie= req.getParameter("especie");
		String edad=req.getParameter("edad");
		String sexo = req.getParameter("sexo");
		String mensaje = req.getParameter("mensaje");
		
		Mascota p = new Mascota(nombre,especie,edad,sexo,mensaje);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			pm.makePersistent(p);
			resp.getWriter().println("Datos grabados correctamente");
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrió un error, <a href='index07.html'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
	}
}
