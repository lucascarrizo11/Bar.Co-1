package logica.copy;

public class RutaMaritima {
	private int idRuta;
	private final String origen= "Buenos Aires";
	public RutaMaritima(int idRuta) {
		super();
		this.idRuta = idRuta;
	}
	@Override
	public String toString() {
		return "RutaMaritima [idRuta=" + idRuta + ", origen=" + origen + "]";
	}
	public int getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}
	public String getOrigen() {
		return origen;
	}
	
}
