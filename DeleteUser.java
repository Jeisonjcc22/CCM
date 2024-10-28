package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Importancion de la clase Usuario.java
import models.Usuario;


public class DeleteUser {
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
            
            
            Long userId = 1919731L; // Tipo de datos Long L - Usuario a eliminar

            // Obtener el usuario a eliminar por su ID
            Usuario userToDelete = session.get(Usuario.class, userId);

            // Verificar si el usuario existe antes de intentar eliminarlo
            if (userToDelete != null) {
                session.delete(userToDelete); // Eliminar el usuario
                System.out.println("Usuario eliminado: " + userId);
            } else {
                System.out.println("Usuario no encontrado con ID: " + userId);
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

