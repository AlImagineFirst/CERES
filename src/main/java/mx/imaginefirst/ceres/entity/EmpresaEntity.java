/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.Empresa;
import mx.imaginefirst.ceres.domain.catalog.Actividad;
import mx.imaginefirst.ceres.domain.catalog.Estado;
import mx.imaginefirst.ceres.domain.catalog.Giro;
import mx.imaginefirst.ceres.domain.catalog.Municipio;
import mx.imaginefirst.ceres.domain.catalog.Rama;
import mx.imaginefirst.ceres.domain.catalog.Regimen;
import mx.imaginefirst.ceres.domain.catalog.Sector;
import mx.imaginefirst.ceres.domain.catalog.Tamano;
import mx.imaginefirst.ceres.domain.catalog.Tipo;
import mx.imaginefirst.ceres.interfaces.IEntity;

public class EmpresaEntity implements IEntity {

	private Long id;
	private String rfc;
	private String nombre;
	private String sucursal;
	private String direccion;
	private String colonia;
	private String codigo_postal;
	private EstadoEntity estado;
	private MunicipioEntity municipio;
	private TamanoEntity tamano;
	private TipoEntity tipo;
	private GiroEntity giro;
	private SectorEntity sector;
	private RamaEntity rama;
	private RegimenEntity regimen;
	private ActividadEntity actividad;
	private boolean isActive;
	
	@Override
	public Object toModel() {
		ObjectMapper mapper = new ObjectMapper();
		Empresa model = mapper.convertValue(this, Empresa.class);
		return model;
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