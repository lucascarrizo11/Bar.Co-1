package logica.copy;

public class Tripulacion {
	private int cantidad;
	private int idTripulacion;
	public Tripulacion(int cantidad, int idTripulacion) {
		super();
		this.cantidad = cantidad;
		this.idTripulacion = idTripulacion;
	}
	@Override
	public String toString() {
		return "Tripulacion [cantidad=" + cantidad + ", idTripulacion=" + idTripulacion + "]";
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdTripulacion() {
		return idTripulacion;
	}
	public void setIdTripulacion(int idTripulacion) {
		this.idTripulacion = idTripulacion;
	}
	
}