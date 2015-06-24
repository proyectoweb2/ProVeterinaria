package epis.unsa.Consultas;



import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SaveConsulta extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		
		String correo = req.getParameter("correo");
		String consulta = req.getParameter("consulta");
		
		Consulta p = new Consulta(nombre,apellido,correo,consulta);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			if(consulta==""){
				resp.getWriter().println("ingrese consulta");
			
			}
			else{
			pm.makePersistent(p);
			resp.getWriter().println("Datos grabados correctamente");
			}
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrió un error, <a href='index07.html'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
	}
}
