package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comentario extends General {
	
	private String texto;
	private Integer estrellas;
	
	
	@JsonBackReference(value = "variableRelacionCS")
	@ManyToOne
	private Suscrito suscrito;
	
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Integer getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}
	public Suscrito getSuscrito() {
		return suscrito;
	}
	public void setSuscrito(Suscrito suscrito) {
		this.suscrito = suscrito;
	}
	
	
	

}
