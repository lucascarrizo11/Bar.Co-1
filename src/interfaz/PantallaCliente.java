package interfaz;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import logica.Cliente;
import logica.Envio;
import logica.InicioSesion;
import logica.Producto;

public class PantallaCliente implements InicioSesion{

	public void MenuCliente(Cliente cliente) {
	
		JOptionPane.showMessageDialog(null, "ddd");
		LinkedList <Envio> envios = new LinkedList <> ();
		Producto producto = new Producto ();
		String[] opCliente = {"Solicitar envio","Ver informacion envios"};
		
		int opciones=JOptionPane.showOptionDialog(null,"Ingrese la opcion", null, 0, 0, null, opCliente, opCliente[0]);
		
		switch (opciones) {
		case 0:
			JOptionPane.showMessageDialog(null, "Ingrese la informacion de los productos: ");
			cliente.solicitarEnvio(envios, producto);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Informacion de los envios: ");
			break;
		default:
			break;
		}
		
		
	}
	
}
