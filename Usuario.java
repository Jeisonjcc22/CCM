package models;


//Importacion de Entidades

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table (name = "usuarios") //Nombre de la tabla MySQL donde crearemos los datos

public class Usuario {  //Nombrar a la clase como publica
	
	
	//Nombramiento de cada columna de la tabla Usuarios
    @Id
    @Column(name = "id_usuario")
    private Long id_usuario;
	
	@Column(name="contraseña")
	private String contraseña;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="correo")
	private String correo;
	
    public Usuario () { //Constructor vacio, siempre es imporatante dejarlo
    }

	public Usuario(Long id_usuario, String contraseña, String nombres, String apellidos, String correo) {  //Constructor 
		super();
		
		//Constructor donde hacemos referencia de cada columna de nuestra tabla Usuarios 
		//a como sera nombrado cada columba en los getters y setters, es decir cada equivalente.
		
		
		this.id_usuario = id_usuario; 
		this.contraseña = contraseña;
		this.nombres = nombres;	
		this.apellidos = apellidos;
		this.correo = correo;
	}
	
	//Getters y Setters realiazados de forma automatica por eclipse.
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", contraseña=" + contraseña + ", nombres=" + nombres
				+ ", apellidos=" + apellidos + ", correo=" + correo + "]";
	}
	
    
}
