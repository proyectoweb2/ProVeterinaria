package epis.unsa.publicacion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class publicacionSave extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombr = req.getParameter("admin");
		int numer = Integer.parseInt(req.getParameter("nume"));
		String pdoctor = req.getParameter("pdoc");
		String publicacion = req.getParameter("pub");
		
		Publicacion p = new Publicacion(nombr,numer,pdoctor,publicacion);
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