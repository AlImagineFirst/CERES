/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.catalogo.Area;
import mx.imaginefirst.ceres.domain.catalogo.Carrera;
import mx.imaginefirst.ceres.domain.catalogo.Estado;
import mx.imaginefirst.ceres.domain.catalogo.EstadoEstudiante;
import mx.imaginefirst.ceres.domain.catalogo.EstadoExpediente;
import mx.imaginefirst.ceres.domain.catalogo.Municipio;
import mx.imaginefirst.ceres.domain.catalogo.Sexo;
import mx.imaginefirst.ceres.entity.UsuarioEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

@JsonIgnoreProperties(ignoreUnknown=true)
@SuppressWarnings("serial")
@Entity
public class Estudiante extends BaseObject implements IModel {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String matricula;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String apellido_paterno;
	
	@Column(nullable = true)
	private String apellido_materno;
	
	@Column(nullable = false)
	private int generacion_inicio;

	@Column(nullable = false)
	private int generacion_fin;
	
	@OneToOne
	private Carrera carrera;
	
	@OneToOne
	private Area area;
	
	@OneToOne
	private Sexo sexo;
	
	@Column(nullable = false)
	private String curp;
	
	@OneToOne
	private EstadoEstudiante estadoEstudiante;
	
	@Column(nullable = false)
	private float cf;
	
	@Column(nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date fecha_nacimiento;
	
	@Column(nullable = true)
	private String telefono;
	
	@Column(nullable = false)
	private String direccion;

	@Column(nullable = false)
	private String colonia;
	
	@Column (nullable = false)
	private String codigo_postal;
	
	@OneToOne
	private Estado estado;
	
	@OneToOne
	private Municipio municipio;
	
	@Column(nullable = false)
	private String correo;
	
	@Column(nullable = false)
	private String password;
	
	@OneToOne
	private EstadoExpediente estadoExpediente;
	
	@Override
	public Object toEntity() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UsuarioEntity entity = mapper.convertValue(this, UsuarioEntity.class);
		return entity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public int getGeneracion_inicio() {
		return generacion_inicio;
	}

	public void setGeneracion_inicio(int generacion_inicio) {
		this.generacion_inicio = generacion_inicio;
	}

	public int getGeneracion_fin() {
		return generacion_fin;
	}

	public void setGeneracion_fin(int generacion_fin) {
		this.generacion_fin = generacion_fin;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public EstadoEstudiante getEstadoEstudiante() {
		return estadoEstudiante;
	}

	public void setEstadoEstudiante(EstadoEstudiante estadoEstudiante) {
		this.estadoEstudiante = estadoEstudiante;
	}

	public float getCf() {
		return cf;
	}

	public void setCf(float cf) {
		this.cf = cf;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EstadoExpediente getEstadoExpediente() {
		return estadoExpediente;
	}

	public void setEstadoExpediente(EstadoExpediente estadoExpediente) {
		this.estadoExpediente = estadoExpediente;
	}
}