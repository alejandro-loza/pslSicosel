package sspc.gob.mx.psr.validator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import sspc.gob.mx.psr.enums.Sexo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
@Setter
public class SentenciadoValidador {
    @NotNull(message= "sentenced.name.null")
    @NotBlank
    @Size(min = 1, max = 100)
    String nombre;

    @NotBlank
    @Size(min = 1, max = 100)
    String apellidoPaterno;

    @NotBlank
    @Size(min = 1, max = 100)
    String apellidoMaterno;

    @NotNull
    Long nacionalidadId;

    @NotNull
    Long estadoId;

    @NotNull
    @NotBlank
    @Size(min = 18, max = 18)
    String documento;

    @NotNull
    Long estadoCivil;

    @NotBlank
    @Size(min = 1, max = 100)
    String alias;

    @NotBlank
    @Size(min = 1, max = 100)
    String otrosNombres;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    LocalDate fechaNacimiento;

    Long ocupacionId;

    @NotNull
    Sexo sexo;

    @NotNull
    Long etniaId;

    @NotNull
    Long escolaridad;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    String telefonoFijo;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 50)
    String celular;

    @Email
    @NotNull
    @NotBlank
    String correoElectronico;

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

	public Long getNacionalidadId() {
		return nacionalidadId;
	}

	public void setNacionalidadId(Long nacionalidadId) {
		this.nacionalidadId = nacionalidadId;
	}

	public Long getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(Long estadoId) {
		this.estadoId = estadoId;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Long getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Long estadoCivil) {
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

	public Long getOcupacionId() {
		return ocupacionId;
	}

	public void setOcupacionId(Long ocupacionId) {
		this.ocupacionId = ocupacionId;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Long getEtniaId() {
		return etniaId;
	}

	public void setEtniaId(Long etniaId) {
		this.etniaId = etniaId;
	}

	public Long getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(Long escolaridad) {
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
