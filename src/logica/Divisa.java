package logica;

public class Divisa {
	private String tipo;
	private int idDivisa;
	public Divisa(String tipo, int idDivisa) {
		super();
		this.tipo = tipo;
		this.idDivisa = idDivisa;
	}
	@Override
	public String toString() {
		return "Divisa [tipo=" + tipo + ", idDivisa=" + idDivisa + "]";
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdDivisa() {
		return idDivisa;
	}
	public void setIdDivisa(int idDivisa) {
		this.idDivisa = idDivisa;
	}
}
