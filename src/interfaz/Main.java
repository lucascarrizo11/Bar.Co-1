package interfaz;

import javax.swing.JOptionPane;

import logica.Cliente;
import logica.Producto;

public class Main {

	public static void main(String[] args) {

		PantallaCliente pantalla = new PantallaCliente();
		Cliente cliente = new Cliente ("","","","","",1);
		
		pantalla.MenuCliente(cliente);
		System.out.println("Creacion del proyecto Bar.Co");
		
		
		System.out.println("2DA PRUEBA");
	
		System.err.println("probandoooofdsa");
		
		
		JOptionPane.showMessageDialog(null, "probando rama");
	}

}
