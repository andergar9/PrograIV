package tests;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import co.nihil.turnero.modelo.Asesor;



public class testAsesor {
	
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
	/*Crear gestor de persistencia */	
	emf = Persistence.createEntityManagerFactory("Persistencia");
	manager = emf.createEntityManager();
	

	}

}
