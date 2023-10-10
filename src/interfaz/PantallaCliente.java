package interfaz;

import java.util.Iterator;

import javax.swing.JOptionPane;

import logica.Cliente;
import logica.InicioSesion;

public class PantallaCliente implements InicioSesion{

	public void MenuCliente(Cliente cliente) {
	
		JOptionPane.showMessageDialog(null, "ddd");
		
		
		String[] opCliente = {"Solicitar envio","Ver informacion envios"};
		
		int opciones=JOptionPane.showOptionDialog(null,"Ingrese la opcion", null, 0, 0, null, opCliente, opCliente[0]);
		
		switch (opciones) {
		case 0:
			JOptionPane.showMessageDialog(null, "Ingrese la informacion de los productos: ");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Informacion de los envios: ");
			break;
		default:
			break;
		}
		
		
	}
	
}
