package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table (name = "materiales")

public class Materiales {

	//Nombramiento de cada columna de la tabla Equipos
    @Id
    @Column(name = "id_material")
    private Integer id_material;
	
	@Column(name="nombre_material")
	private String nombre_material;
	
	@Column(name="tipo_material")
	private String tipo_material;
	
	@Column(name="descripcion_material")
	private String descripcion_material;
	
	@Column(name="cantidad")
	private Integer cantidad;
	
    public Materiales () { //Constructor vacio, siempre es imporatante dejarlo
    }

	public Integer getId_material() {
		return id_material;
	}

	public void setId_material(Integer id_material) {
		this.id_material = id_material;
	}

	public String getNombre_material() {
		return nombre_material;
	}

	public void setNombre_material(String nombre_material) {
		this.nombre_material = nombre_material;
	}

	public String getTipo_material() {
		return tipo_material;
	}

	public void setTipo_material(String tipo_material) {
		this.tipo_material = tipo_material;
	}

	public String getDescripcion_material() {
		return descripcion_material;
	}

	public void setDescripcion_material(String descripcion_material) {
		this.descripcion_material = descripcion_material;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Materiales [id_material=" + id_material + ", nombre_material=" + nombre_material + ", tipo_material="
				+ tipo_material + ", descripcion_material=" + descripcion_material + ", cantidad=" + cantidad + "]";
	}
}