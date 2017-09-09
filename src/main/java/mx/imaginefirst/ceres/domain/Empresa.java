/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.catalogo.Actividad;
import mx.imaginefirst.ceres.domain.catalogo.Estado;
import mx.imaginefirst.ceres.domain.catalogo.Giro;
import mx.imaginefirst.ceres.domain.catalogo.Municipio;
import mx.imaginefirst.ceres.domain.catalogo.Rama;
import mx.imaginefirst.ceres.domain.catalogo.Regimen;
import mx.imaginefirst.ceres.domain.catalogo.Sector;
import mx.imaginefirst.ceres.domain.catalogo.Tamano;
import mx.imaginefirst.ceres.domain.catalogo.Tipo;
import mx.imaginefirst.ceres.entity.UserEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

@JsonIgnoreProperties(ignoreUnknown=true)
@SuppressWarnings("serial")
@Entity
public class Empresa extends BaseObject implements IModel {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String rfc;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String sucursal;

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
	
	@OneToOne
	private Tamano tamano;
	
	@OneToOne
	private Tipo tipo;
	
	@OneToOne
	private Giro giro;
	
	@OneToOne
	private Sector sector;
	
	@OneToOne
	private Rama rama;
	
	@OneToOne
	private Regimen regimen;
	
	@OneToOne
	private Actividad actividad;
	
	@Column(nullable = false)
	private boolean isActive;
	
	@Override
	public Object toEntity() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UserEntity entity = mapper.convertValue(this, UserEntity.class);
		return entity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
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

	public Tamano getTamano() {
		return tamano;
	}

	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Giro getGiro() {
		return giro;
	}

	public void setGiro(Giro giro) {
		this.giro = giro;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Rama getRama() {
		return rama;
	}

	public void setRama(Rama rama) {
		this.rama = rama;
	}

	public Regimen getRegimen() {
		return regimen;
	}

	public void setRegimen(Regimen regimen) {
		this.regimen = regimen;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}