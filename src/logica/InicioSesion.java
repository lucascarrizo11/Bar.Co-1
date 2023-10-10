package logica;

import javax.swing.JOptionPane;

public interface InicioSesion {
	
	public default  boolean iniciarSesion(String nombre,String clave) {
		
		if ((nombre.isEmpty() && nombre.length() <= 2) || (clave.isEmpty() && clave.length() < 8)) {
			
			JOptionPane.showMessageDialog(null, "Error en el usuario o clave");
			return false;
		}else {
			JOptionPane.showMessageDialog(null, "Pudo iniciae sesion correctamente");
			
			return true;
		}
		
	}

}
