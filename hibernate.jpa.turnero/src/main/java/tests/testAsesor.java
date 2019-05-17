package tests;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import co.nihil.turnero.modelo.Asesor;




public class testAsesor {
	
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	@SuppressWarnings("unused")
	private static ArrayList<String> servicio,servicio1,servicio2,servicio3;

	public static void main(String[] args) {
	/*Crear gestor de persistencia */	
	emf = Persistence.createEntityManagerFactory("Persistencia");
	manager = emf.createEntityManager();
	Asesor a = new Asesor("Juan", servicio2, 1, 1);
	
	manager.getTransaction().begin();
	manager.persist(a);
	manager.getTransaction().commit();
	
	 imprimir();
	}
	
	@SuppressWarnings("unchecked")
	public static void imprimir() {
		List <Asesor> ase = (List<Asesor>)manager.createQuery("FROM Asesores").getResultList();
		System.out.println("Hay"+ ase.size() +"Asesores en el sistema");
		for(Asesor us:ase) {
			System.out.println(us.toString());
	}

	
	}
}
	

