package logica;

import java.util.LinkedList;

import interfaz.PantallaCliente;

public class Cliente extends Persona {
	
	private int idCliente;
	private LinkedList <Cliente> clientes = new LinkedList <>();
	

	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public LinkedList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}



	public Cliente(String nombre, String apellido, String mail, String clave, String rol, int idCliente) {
		super(nombre, apellido, mail, clave, rol);
		this.idCliente = idCliente;
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", clientes=" + clientes + "]";
	} 

	/*
	public void agregar () {
		Cliente cliente1 = new Cliente ("", "", "ivanivan", "123456789", "", 0);
		clientes.add(cliente1);
	}
	*/
}
