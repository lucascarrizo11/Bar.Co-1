package logica;

public class Barco {
	private int idBarco;
	private double capacidadCombustible;
	private int capacidadToneladas;
	private int espacioContenedor;
	private double velocidad;
	private Tripulacion tripulacion;
	
	public Barco(int idBarco, double capacidadCombustible, int capacidadToneladas, int espacioContenedor,
			double velocidad, Tripulacion tripulacion) {
		super();
		this.idBarco = idBarco;
		this.capacidadCombustible = capacidadCombustible;
		this.capacidadToneladas = capacidadToneladas;
		this.espacioContenedor = espacioContenedor;
		this.velocidad = velocidad;
		this.tripulacion = tripulacion;
		
	}
	@Override
	public String toString() {
		return "Barco [idBarco=" + idBarco + ", capacidadCombustible=" + capacidadCombustible + ", capacidadToneladas="
				+ capacidadToneladas + ", espacioContenedor=" + espacioContenedor + ", velocidad=" + velocidad
				+ ", tripulacion=" + tripulacion + "]";
	}
	public int getIdBarco() {
		return idBarco;
	}
	public void setIdBarco(int idBarco) {
		this.idBarco = idBarco;
	}
	public double getCapacidadCombustible() {
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(double capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	public int getCapacidadToneladas() {
		return capacidadToneladas;
	}
	public void setCapacidadToneladas(int capacidadToneladas) {
		this.capacidadToneladas = capacidadToneladas;
	}
	public int getEspacioContenedor() {
		return espacioContenedor;
	}
	public void setEspacioContenedor(int espacioContenedor) {
		this.espacioContenedor = espacioContenedor;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public Tripulacion getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(Tripulacion tripulacion) {
		this.tripulacion = tripulacion;
	}
}
