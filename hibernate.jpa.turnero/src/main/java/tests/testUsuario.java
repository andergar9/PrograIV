package tests;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import co.nihil.turnero.modelo.Usuario;

public class testUsuario {
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		/*Crear gestor de persistencia */	
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		Usuario u = new Usuario("1A","Santi","Servicio1","Prioridad1");
		
		manager.getTransaction().begin();
		manager.persist(u);
		manager.getTransaction().commit();
		
		imprimir();

	}
	
	@SuppressWarnings("unchecked")
	public static void imprimir() {
		List <Usuario> user = (List<Usuario>)manager.createQuery("FROM Usuarios").getResultList();
		System.out.println("Hay"+ user.size() +"Usuarios en el sistema");
		for(Usuario us:user) {
			System.out.println(us.toString());
		}
		
	}

}
