package interfaz;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import datos.Conexion;
import logica.Capitan;
import logica.Cliente;
import logica.Encargado;
import logica.HistorialEnvio;
import logica.InicioSesion;
import logica.Producto;
import validacion.Validar;

public class Gestor implements InicioSesion {

	public static void main(String[] args) {
		Gestor valida = new Gestor();
		Validar va = new Validar();
		Cliente cliente = new Cliente("", "", "", "");
		PantallaCliente pc = new PantallaCliente();
		Encargado encargado = new Encargado("", "", "", "");
		PantallaEncargado pe = new PantallaEncargado();
		//Capitan capitan = new Capitan("", "", "", "", "", 0);
		PantallaCapitan pca = new PantallaCapitan();
		HistorialEnvio hist = new HistorialEnvio(0, null);
		Producto prod = new Producto(0, null, 0, null, null);

		/*
		 * Conexion conexion = new Conexion (); Connection con = conexion.conectar();
		 * PreparedStatement stmt;
		 */
		String clave = "";
		String claveconfirmar = "";
		String nombre = "", apellido = "", usuario = "";
		boolean usuariorepetido;

		int opciones2;
		String[] menu = { "Registarse", "Iniciar Sesion", "Salir" };
		do {
			opciones2 = JOptionPane.showOptionDialog(null, "Ingrese la opcion", null, 0, 0, null, menu, menu[0]);

			if (opciones2 == 0) {

				do {
					nombre = JOptionPane.showInputDialog("Ingrese su nombre");
					apellido = JOptionPane.showInputDialog("Ingrese su apellido");
					usuario = JOptionPane
							.showInputDialog("Ingrese su nombre de usuario (el nombre de usuario es su mail)");

					usuariorepetido = false;
					for (int i = 0; i < cliente.getClientes().size(); i++) {
						if (usuario.equalsIgnoreCase(cliente.getClientes().get(i).getMail())) {
							usuariorepetido = true;
							break;
						}

					}
					if (usuariorepetido == true) {
						JOptionPane.showMessageDialog(null, "Usuario repetido, ingrese otro nombre de usuario");
					} else {

						if (usuariorepetido == false && valida.iniciarSesionNombre(usuario, cliente) == true
								&& valida.validarMail(usuario) == true) {

							clave = JOptionPane
									.showInputDialog("Ingrese su contraseña (tiene que tener 8 dígitos o más)");
							claveconfirmar = JOptionPane.showInputDialog("Repita su contraseña para confirmar");

							if (valida.iniciarSesionClave(clave, claveconfirmar) == true) {

								if (clave.equalsIgnoreCase(claveconfirmar)) {
									// cliente.setNombre(nombre);
									Cliente nuevoCliente = encargado.crearCliente(nombre, apellido, usuario, clave);
									JOptionPane.showMessageDialog(null, nuevoCliente);

//System.out.println(nuevoCliente.getMail());
									System.out.println(nuevoCliente.guardar());

//System.out.println(va.validarIngreso(nuevoCliente));
									cliente.getClientes().add(nuevoCliente);
									JOptionPane.showMessageDialog(null, "Registrado con éxito!");
//JOptionPane.showMessageDialog(null, cliente.getClientes());

								}

							}
						}

					}
				} while (valida.iniciarSesionNombre(nombre, cliente) == false && valida.validarMail(nombre) == false
						&& valida.iniciarSesionClave(clave, claveconfirmar) == false);

			} else if (opciones2 == 1) {

				nombre = JOptionPane.showInputDialog("ingrese su nombre de usuario");
				clave = JOptionPane.showInputDialog("ingrese su clave");

				if (valida.iniciarSesionNombre(nombre, cliente) == false) {

				}
				if (valida.iniciarSesionClave(clave, claveconfirmar) == false) {

				}

				for (int i = 0; i < cliente.getClientes().size(); i++) {
					if (nombre.equalsIgnoreCase(cliente.getClientes().get(i).getMail())
							&& clave.equalsIgnoreCase(cliente.getClientes().get(i).getClave())) {
						pc.MenuCliente(cliente, hist, prod);

					}

				}
				for (int j = 0; j < encargado.getEncargados().size(); j++) {

					if (nombre.equalsIgnoreCase(encargado.getEncargados().get(j).getMail())
							&& clave.equalsIgnoreCase(encargado.getEncargados().get(j).getClave())) {
						pe.MenuEncargado(encargado);
					}
				}

			/*	for (int h = 0; h < capitan.getCapitanes().size(); h++) {
					if (nombre.equalsIgnoreCase(capitan.getCapitanes().get(h).getMail())
							&& clave.equalsIgnoreCase(capitan.getCapitanes().get(h).getClave())) {
						pca.MenuCapitan(capitan);
					}
				}
				
				*/

			}

		} while (opciones2 != 2);

	}

}
