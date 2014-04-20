package test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @since 20.04.2014
 * @author Julian Schelker
 */
public class JPAObjectListener implements ServletContextListener {

	// Prepare the EntityManagerFactory & Enhance:
	@Override
	public void contextInitialized(ServletContextEvent e) {
		com.objectdb.Enhancer.enhance("guest.*");
		EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("$objectdb/db/guest.odb");
		e.getServletContext().setAttribute("emf", emf);
	}

	// Release the EntityManagerFactory:
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		EntityManagerFactory emf = (EntityManagerFactory) e.getServletContext()
			.getAttribute("emf");
		emf.close();
	}
}
