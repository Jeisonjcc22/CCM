	package controller;
	
	//Importacion de Session Factory
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	
	
	//Importancion de la clase Usuario.java
	
	import models.Usuario;
	
	//
	public class UserController {
	
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
	            
	            // Crear un nuevo objeto Usuario con los datos proporcionados
	            Usuario usuario = new Usuario(1919731L, "balbino1234", "Balbino", "Leon", "balbino71@gmail.com");
	            
	            // Mensaje de inicio de transacción, indicando que se esta ejecutando
	            System.out.println("Iniciando transacción...");

	            // Guardar el objeto Usuario en la base de datos
	            session.save(usuario);
	            
	            // Confirmar la transacción
	            session.getTransaction().commit();
	            
	            // Mensaje de éxito
	            System.out.println("Usuario Creado");
	            } finally {
	            	// Asegurarse de que la sesión y la fábrica se cierren al final
	            	session.close();
	                sessionFactory.close();}
		}
	}

	
	

