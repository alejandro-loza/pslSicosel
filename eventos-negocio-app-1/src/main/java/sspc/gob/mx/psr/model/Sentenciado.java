package sspc.gob.mx.psr.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import sspc.gob.mx.psr.enums.Sexo;
import sspc.gob.mx.psr.model.catalog.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Setter
@Builder
@Entity
public class Sentenciado //extends EntidadBase 
{
	
    @Id
    @GeneratedValue
    private UUID id;

    @NotNull(message= "sentenced.name.null")
    @NotBlank
    @Size(min = 1, max = 100)
    private String nombre;

    @NotBlank
    @Size(min = 1, max = 100)
    private String apellidoPaterno;

    @NotBlank
    @Size(min = 1, max = 100)
    private String apellidoMaterno;

    
    @NotNull
    @ManyToOne
    @JoinColumn(name="pais_id")
    private Pais nacionalidad;

    @NotNull
    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;

    @NotNull
    @NotBlank
    @Size(min = 18, max = 18)
    private String documento;

    @NotNull
    @ManyToOne
    @JoinColumn(name="folio_id")
    private Folio folio;

    @NotNull
    @ManyToOne
    @JoinColumn(name="estado_civil_id")
    private EstadoCivil estadoCivil;

    @NotBlank
    @Size(min = 1, max = 100)
    private String alias;

    @NotBlank
    @Size(min = 1, max = 100)
    private String otrosNombres;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate fechaNacimiento;

    @NotNull
    @ManyToOne
    @JoinColumn(name="ocupacion_id")
    private Ocupacion ocupacion;

    @Enumerated(EnumType.STRING)
    @Column(name="sexo")
    private Sexo sexo;

    @NotNull
    @ManyToOne
    @JoinColumn(name="etnia_id")
    private Etnia etnia;

    @NotNull
    @ManyToOne
    @JoinColumn(name="escolaridad_id")
    private Escolaridad escolaridad;

    @NotNull
    private String telefonoFijo;

    @NotNull
    private String celular;

    @NotBlank
    @NotBlank
    private String correoElectronico;
    
   
    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Pais getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Pais nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Folio getFolio() {
		return folio;
	}

	public void setFolio(Folio folio) {
		this.folio = folio;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getOtrosNombres() {
		return otrosNombres;
	}

	public void setOtrosNombres(String otrosNombres) {
		this.otrosNombres = otrosNombres;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Ocupacion getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(Ocupacion ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Etnia getEtnia() {
		return etnia;
	}

	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}

	public Escolaridad getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(Escolaridad escolaridad) {
		this.escolaridad = escolaridad;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	
    
    
    

}
