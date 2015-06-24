package epis.unsa.publicacion;


import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class publicacionBorrar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nume")!=null ){
			int numer = Integer.parseInt(req.getParameter("nume"));
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Publicacion.class);
			q.setFilter("nume == numeParam");
			q.declareParameters("int numeParam");	
			try{
				q.deletePersistentAll(numer);
				
				resp.getWriter().println("Se han borrado personas.");
				resp.sendRedirect("/publicacionlista");
			}catch(Exception e){
					System.out.println(e);
					resp.getWriter().println("No se han podido borrar personas.");
					resp.sendRedirect("/publicacionlista");
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			resp.getWriter().println("No se ha especificado el color.");
			resp.sendRedirect("/publicacionlista");
		}		
	}
}