package logica;

import javax.swing.JOptionPane;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Encargado extends Persona {
	private int idEncargado;
	private static final AtomicInteger indice = new AtomicInteger(0);

	private LinkedList<Encargado> encargados = new LinkedList<>();

	public Encargado(String nombre, String apellido, String mail, String clave) {
		super(nombre, apellido, mail, clave);
		this.idEncargado = idEncargado;
		this.encargados = encargados;
	}

	public int getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(int idEncargado) {
		this.idEncargado = idEncargado;
	}

	public LinkedList<Encargado> getEncargados() {
		return encargados;
	}

	public void setEncargados(LinkedList<Encargado> encargados) {
		this.encargados = encargados;
	}

	public static AtomicInteger getIndice() {
		return indice;
	}

	@Override
	public String toString() {
		return "Encargado [idEncargado=" + idEncargado + ", encargados=" + encargados + "]";
	}

	public Cliente crearCliente(String nombre, String apellido, String mail, String clave) {

		Cliente cliente = new Cliente(nombre, apellido, mail, clave);

		return cliente;
	}

	public double calcularRutaMaritima(Barco barco) {
		return 0;
	}

}
