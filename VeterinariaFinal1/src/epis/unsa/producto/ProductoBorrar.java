package epis.unsa.producto;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ProductoBorrar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nom")!=null ){
			String nombre = req.getParameter("nom");
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Producto.class);
			//q.setFilter("nom == nomParam");
			//q.declareParameters("String nomParam");	
			try{
				q.deletePersistentAll(nombre);
				
				resp.getWriter().println("Se han borrado personas.");
				resp.sendRedirect("/productolista");
			}catch(Exception e){
					System.out.println(e);
					resp.getWriter().println("No se han podido borrar personas.");
					resp.sendRedirect("/productolista");
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			resp.getWriter().println("No se ha especificado el color.");
			resp.sendRedirect("/productolista");
		}		
	}
}