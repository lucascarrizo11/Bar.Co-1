package interfaz;

import javax.swing.JOptionPane;

import logica.Capitan;
import logica.InicioSesion;

public class PantallaCapitan implements InicioSesion{
	
	public void MenuCapitan(Capitan capitan) {
		
		
		String[] opCapitan = {"Generar informe envio","Administrar tripulacion"};
		
		int opciones=JOptionPane.showOptionDialog(null,"Ingrese la opcion", null, 0, 0, null, opCapitan, opCapitan[0]);
		
		switch (opciones) {
		case 0:
			JOptionPane.showMessageDialog(null, "INFORME DIARIO ENVIO");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "ADMINISTRAR TRIPULACION:");
			break;
		default:
			break;
		}

		
	}

}
