package mx.imaginefirst.ceres.domain.encuesta;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mx.imaginefirst.ceres.domain.BaseObject;
import mx.imaginefirst.ceres.entity.UsuarioEntity;
import mx.imaginefirst.ceres.interfaces.IModel;

public class Resultados extends BaseObject implements IModel {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String objetivo;
	
	@Column(nullable = false)
	private int numeroEjercicios;
	
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public int getNumeroEjercicios() {
		return numeroEjercicios;
	}

	public void setNumeroEjercicios(int numeroEjercicios) {
		this.numeroEjercicios = numeroEjercicios;
	}
}
