package logica.copy;

public class Puerto {
	private String nombre;

	public Puerto(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Puerto [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
