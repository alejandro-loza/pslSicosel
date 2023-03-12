package sspc.gob.mx.psr.model.catalog;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nombre;
    public String alpha2;
    public String alpha3;
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
	public String getAlpha2() {
		return alpha2;
	}
	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}
	public String getAlpha3() {
		return alpha3;
	}
	public void setAlpha3(String alpha3) {
		this.alpha3 = alpha3;
	}


}
