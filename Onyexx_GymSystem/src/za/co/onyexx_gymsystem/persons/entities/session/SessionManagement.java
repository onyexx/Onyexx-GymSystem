package za.co.onyexx_gymsystem.persons.entities.session;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class SessionManagement {

	public static EntityManager getEntityManager() {
		String persistenceUnitName = "jpaPersistenceUnit";
		EntityManagerFactory emfa = Persistence.createEntityManagerFactory(persistenceUnitName);
		EntityManager em = emfa.createEntityManager();
		
		return em;
	}
}
