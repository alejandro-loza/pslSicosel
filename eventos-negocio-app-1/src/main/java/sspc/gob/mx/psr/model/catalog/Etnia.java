package sspc.gob.mx.psr.model.catalog;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "cat_etnia")
public class Etnia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cat_etnia")
    public Long id;
    public String nombre;
    public String descripcion;
    public boolean activo = true;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

    
    
}
