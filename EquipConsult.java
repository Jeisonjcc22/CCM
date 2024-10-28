package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

import models.Equipos;

public class EquipConsult {
	// Método principal que se ejecuta al iniciar la aplicación
				public static void main(String[] args) {
					
				   // Crear una sesión de fábrica a partir de la configuración de Hibernate
			        SessionFactory sessionFactory = new Configuration()
			        		
			                .configure("hibernate.cfg.xml") // Cargar la configuración desde hibernate.cfg.xml
			                .addAnnotatedClass(Equipos.class) // Añadir la clase Usuario.java
			                .buildSessionFactory(); // Construir la sesión
			        
			        Session session = sessionFactory.getCurrentSession();
			        
			        try {
			        	
			        	// Iniciar una transacción
			            session.beginTransaction();
			            
			            // Realiza la consulta general en la tabla Equipos
			            List<Equipos> resultado = session.createQuery("from Equipos", Equipos.class).getResultList();
			            System.out.println("Consulta General:");
			            for (Equipos u : resultado) {
			                System.out.println(u); // 
			            }

			            // Confirmar la transacción
			            session.getTransaction().commit();
			            
			            // Mensaje de éxito
			            System.out.println("Proceso Finalizado");
			            } finally {
			            	// Asegurarse de que la sesión y la fábrica se cierren al final
			            	session.close();
			                sessionFactory.close();}
			}
}


