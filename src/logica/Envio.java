package logica;

import java.time.LocalDate;

public class Envio {
	private int idEnvio;
	private LocalDate fecha;
	public Envio(int idEnvio, LocalDate fecha) {
		super();
		this.idEnvio = idEnvio;
		this.fecha = fecha;
	}
	public int getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(int idEnvio) {
		this.idEnvio = idEnvio;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Envio [idEnvio=" + idEnvio + ", fecha=" + fecha + "]";
	}
}
