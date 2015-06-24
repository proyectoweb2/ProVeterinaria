package epis.unsa.registroMascota;



import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class BorrarMascota extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nombre")!=null ){
			int numero = Integer.parseInt(req.getParameter("nombre"));
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Mascota.class);
			q.setFilter("nombre == nombreParam");
			q.declareParameters("int nombreParam");	
			try{
				q.deletePersistentAll(numero);
				
				resp.getWriter().println("Se han borrado personas.");
				resp.sendRedirect("/listaMascota");
			}catch(Exception e){
					System.out.println(e);
					resp.getWriter().println("No se han podido borrar personas.");
					resp.sendRedirect("/listaMascota");
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			resp.getWriter().println("No se ha especificado.");
			resp.sendRedirect("/listaMascota");
		}		
	}
}