package logica.copy;

import java.util.LinkedList;

public class HistorialEnvio {

	private int idHistorial;
	private LinkedList <Envio> envios = new LinkedList <> ();
	public HistorialEnvio(int idHistorial, LinkedList<Envio> envios) {
		super();
		this.idHistorial = idHistorial;
		this.envios = envios;
	}
	@Override
	public String toString() {
		return "HistorialEnvio [idHistorial=" + idHistorial + ", envios=" + envios + "]";
	}
	public int getIdHistorial() {
		return idHistorial;
	}
	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}
	public LinkedList<Envio> getEnvios() {
		return envios;
	}
	public void setEnvios(LinkedList<Envio> envios) {
		this.envios = envios;
	}
	
}
