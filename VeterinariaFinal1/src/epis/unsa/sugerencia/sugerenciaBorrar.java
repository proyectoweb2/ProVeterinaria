package epis.unsa.sugerencia;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class sugerenciaBorrar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("num")!=null ){
			int numero = Integer.parseInt(req.getParameter("num"));
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Sugerencia.class);
			q.setFilter("num == numParam");
			q.declareParameters("int numParam");	
			try{
				q.deletePersistentAll(numero);
				
				resp.getWriter().println("Se han borrado personas.");
				resp.sendRedirect("/sugerencialista");
			}catch(Exception e){
					System.out.println(e);
					resp.getWriter().println("No se han podido borrar personas.");
					resp.sendRedirect("/sugerencialista");
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			resp.getWriter().println("No se ha especificado el color.");
			resp.sendRedirect("/sugerencialista");
		}		
	}
}