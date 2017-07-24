package br.com.agenda.modelo;

import java.util.Date;

public class Evento {
	private Long idDoEvento;
	private String tituloDoEvento;
	private Date inicioDoEvento;
	private Date fimDoEvento;
	private String descricaoDoEvento;
	private boolean statusDoEvento;

	public Long getIdDoEvento() {
		return idDoEvento;
	}

	public void setIdDoEvento(Long idDoEvento) {
		this.idDoEvento = idDoEvento;
	}

	public String getTituloDoEvento() {
		return tituloDoEvento;
	}

	public void setTituloDoEvento(String tituloDoEvento) {
		this.tituloDoEvento = tituloDoEvento;
	}

	public Date getInicioDoEvento() {
		return inicioDoEvento;
	}

	public void setInicioDoEvento(Date inicioDoEvento) {
		this.inicioDoEvento = inicioDoEvento;
	}

	public Date getFimDoEvento() {
		return fimDoEvento;
	}

	public void setFimDoEvento(Date fimDoEvento) {
		this.fimDoEvento = fimDoEvento;
	}

	public String getDescricaoDoEvento() {
		return descricaoDoEvento;
	}

	public void setDescricaoDoEvento(String descricaoDoEvento) {
		this.descricaoDoEvento = descricaoDoEvento;
	}

	public boolean isStatusDoEvento() {
		return statusDoEvento;
	}

	public void setStatusDoEvento(boolean statusDoEvento) {
		this.statusDoEvento = statusDoEvento;
	}


	

}
