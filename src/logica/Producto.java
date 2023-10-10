package logica;

public class Producto {
	private int idProducto;
	private String nombre;
	private Double peso;
	private String tamaño;
	public Producto(int idProducto, String nombre, Double peso, String tamaño) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.peso = peso;
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", peso=" + peso + ", tamaño=" + tamaño
				+ "]";
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
}
