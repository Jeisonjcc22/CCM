package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table (name = "equipos")

public class Equipos {

	//Nombramiento de cada columna de la tabla Equipos
    @Id
    @Column(name = "id_equipo")
    private String id_equipo;
	
	@Column(name="nombre_equipo")
	private String nombre_equipo;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="descripcion_equipo")
	private String descripcion_equipo;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
    public Equipos () { //Constructor vacio, siempre es imporatante dejarlo
    }

	
	public String getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion_equipo() {
		return descripcion_equipo;
	}

	public void setDescripcion_equipo(String descripcion_equipo) {
		this.descripcion_equipo = descripcion_equipo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Equipos [id_equipo=" + id_equipo + ", nombre_equipo=" + nombre_equipo + ", marca=" + marca
				+ ", descripcion_equipo=" + descripcion_equipo + ", cantidad=" + cantidad + "]";
	}
	

}
