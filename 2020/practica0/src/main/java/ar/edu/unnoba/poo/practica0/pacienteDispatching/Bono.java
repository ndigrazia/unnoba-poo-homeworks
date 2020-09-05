package ar.edu.unnoba.poo.practica0.pacienteDispatching;

import java.util.Date;

public class Bono {
	
	private String codigoConsulta;
	private boolean pagaDiferencia;
	private Date fecha;
	private String diagnostico;
	
	public String getCodigoConsulta() {
		return codigoConsulta;
	}
	public void setCodigoConsulta(String codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}
	public boolean isPagaDiferencia() {
		return pagaDiferencia;
	}
	public void setPagaDiferencia(boolean pagaDiferencia) {
		this.pagaDiferencia = pagaDiferencia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
		
}
