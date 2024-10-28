package controller;
//Importacion de Session Factory

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Importancion de la clase Usuario.java
import models.Usuario;


public class UserConsult {
	   // Método principal que se ejecuta al iniciar la aplicación
			public static void main(String[] args) {
				
			   // Crear una sesión de fábrica a partir de la configuración de Hibernate
		        SessionFactory sessionFactory = new Configuration()
		        		
		                .configure("hibernate.cfg.xml") // Cargar la configuración desde hibernate.cfg.xml
		                .addAnnotatedClass(Usuario.class) // Añadir la clase Usuario.java
		                .buildSessionFactory(); // Construir la sesión
		        
		        Session session = sessionFactory.getCurrentSession();
		        
		        try {
		        	
		        	// Iniciar una transacción
		            session.beginTransaction();
		            
		            // Realiza la consulta en la tabla Usuario con los datos proporcionados
		            //en este caso se utiiliza la primary key , id_usuario que corresponde a numero de cedula
		            Usuario resultado = session.get(Usuario.class, 1019154549L);
		            
		            // Resultado obtenido de la consulta
		            System.out.println("Resultado obtenido:" +resultado);

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