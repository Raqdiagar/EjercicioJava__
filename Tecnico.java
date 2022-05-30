package ProyectoEjercicio;
public class Tecnico {

	private String codigoTaller;
	
	public Tecnico(String nombre, String codigoTaller) {
		super(nombre);
		this.codigoTaller = codigoTaller;
		setValorHoras(14);
	}
	public String getCodigoTaller() {
		return codigoTaller;
	}
	public void setCodigoTaller() {
		this.codigoTaller = codigoTaller;
	}
	
	@Override
	public String toString() {
		return "Tecnico [codigoTaller=" + codigoTaller + ", Nombre= "+ getnombre() +]";
				
	}
}
