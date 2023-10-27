package logica.copy;

import java.time.LocalDate;

public class Envio {
	private static int contador=0;
	private int idEnvio;
	private LocalDate fecha;
	Producto producto;
	public Envio(int idEnvio, LocalDate fecha, Producto producto) {
		super();
		this.idEnvio = contador++;
		this.fecha = fecha;
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Envio [idEnvio=" + idEnvio + ", fecha=" + fecha + ", producto=" + producto + "]" +"\n";
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
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
}
