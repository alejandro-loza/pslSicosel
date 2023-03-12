package sspc.gob.mx.psr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Folio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCodigo;
    private Long nacimientoCodigo;
    private String entidadCodigo;
    private Character sexoCodigo;
    private String nacionalidadCodigo;
    private String consecutivo;
    private Long extra;
    
    

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombreCodigo() {
		return nombreCodigo;
	}



	public void setNombreCodigo(String nombreCodigo) {
		this.nombreCodigo = nombreCodigo;
	}



	public Long getNacimientoCodigo() {
		return nacimientoCodigo;
	}



	public void setNacimientoCodigo(Long nacimientoCodigo) {
		this.nacimientoCodigo = nacimientoCodigo;
	}



	public String getEntidadCodigo() {
		return entidadCodigo;
	}



	public void setEntidadCodigo(String entidadCodigo) {
		this.entidadCodigo = entidadCodigo;
	}



	public Character getSexoCodigo() {
		return sexoCodigo;
	}



	public void setSexoCodigo(Character sexoCodigo) {
		this.sexoCodigo = sexoCodigo;
	}



	public String getNacionalidadCodigo() {
		return nacionalidadCodigo;
	}



	public void setNacionalidadCodigo(String nacionalidadCodigo) {
		this.nacionalidadCodigo = nacionalidadCodigo;
	}



	public String getConsecutivo() {
		return consecutivo;
	}



	public void setConsecutivo(String consecutivo) {
		this.consecutivo = consecutivo;
	}



	public Long getExtra() {
		return extra;
	}



	public void setExtra(Long extra) {
		this.extra = extra;
	}



	@Override
    public String toString() {
        return  nombreCodigo +
                nacimientoCodigo +
                entidadCodigo +
                sexoCodigo +
                nacionalidadCodigo +
                consecutivo +
                extra;
    }
}