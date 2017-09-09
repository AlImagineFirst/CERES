/*
 * *******************************************************************************
 *   Copyright 2017 Imagine First.
 * *******************************************************************************
 */
package mx.imaginefirst.ceres.entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.Empresa;
import mx.imaginefirst.ceres.entity.catalog.ActividadEntity;
import mx.imaginefirst.ceres.entity.catalog.EstadoEntity;
import mx.imaginefirst.ceres.entity.catalog.GiroEntity;
import mx.imaginefirst.ceres.entity.catalog.MunicipioEntity;
import mx.imaginefirst.ceres.entity.catalog.RamaEntity;
import mx.imaginefirst.ceres.entity.catalog.RegimenEntity;
import mx.imaginefirst.ceres.entity.catalog.SectorEntity;
import mx.imaginefirst.ceres.entity.catalog.TamanoEntity;
import mx.imaginefirst.ceres.entity.catalog.TipoEntity;
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

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	public MunicipioEntity getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioEntity municipio) {
		this.municipio = municipio;
	}

	public TamanoEntity getTamano() {
		return tamano;
	}

	public void setTamano(TamanoEntity tamano) {
		this.tamano = tamano;
	}

	public TipoEntity getTipo() {
		return tipo;
	}

	public void setTipo(TipoEntity tipo) {
		this.tipo = tipo;
	}

	public GiroEntity getGiro() {
		return giro;
	}

	public void setGiro(GiroEntity giro) {
		this.giro = giro;
	}

	public SectorEntity getSector() {
		return sector;
	}

	public void setSector(SectorEntity sector) {
		this.sector = sector;
	}

	public RamaEntity getRama() {
		return rama;
	}

	public void setRama(RamaEntity rama) {
		this.rama = rama;
	}

	public RegimenEntity getRegimen() {
		return regimen;
	}

	public void setRegimen(RegimenEntity regimen) {
		this.regimen = regimen;
	}

	public ActividadEntity getActividad() {
		return actividad;
	}

	public void setActividad(ActividadEntity actividad) {
		this.actividad = actividad;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}