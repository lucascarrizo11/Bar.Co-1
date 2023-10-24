package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import datos.Conexion;
import interfaz.PantallaCliente;
import java.util.concurrent.atomic.AtomicInteger;

public class Cliente extends Persona {

	private static final AtomicInteger indice = new AtomicInteger(0);

	private int idCliente;
	private LinkedList<Cliente> clientes = new LinkedList<>();

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

	public Cliente(String nombre, String apellido, String mail, String clave) {
		super(nombre, apellido, mail, clave);
		this.idCliente = idCliente;
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre de usuario=" + this.getMail() + "]";
	}

	Conexion conexion = new Conexion();
	Connection con = conexion.conectar();
	PreparedStatement stmt;

	public boolean guardar() {

		String sql = "INSERT INTO `cliente`( `nombre`, `apellido`, `usuario`, `clave`)  VALUES (?,?,?,?)";

		System.out.println(sql);
		System.out.println(stmt);

		try {

			stmt = con.prepareStatement(sql);
			stmt.setString(1, this.getNombre());
			stmt.setString(2, this.getApellido());
			stmt.setString(3, this.getMail());
			stmt.setString(4, this.getClave());
			stmt.executeUpdate();
			return true;

		} catch (Exception e) {
			System.out.println(e);
			return false;
		}

	}

	public boolean solicitarEnvio(Producto producto) {

		

		String sql = "INSERT INTO `producto `(`nombre_producto`, `fragilidad`, `peso`, `id_divisa`) VALUES (?,?,?,?)";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, producto.getNombre());
			stmt.setBoolean(2, producto.getFragil());
			stmt.setLong(3, producto.getPeso());
			stmt.setInt(4, 1);
			System.out.println(sql);
			System.out.println(stmt);
			stmt.execute();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void infoEnvio(LinkedList<Envio> envios) {
		if (envios.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay envios para mostrar");
		}
		for (Envio envio : envios) {
			JOptionPane.showMessageDialog(null, envios + "\n");
		}

	}

}