package ProyectoEjercicio;
public class Oficial extends Tecnico {
	
	private String categoria;
	
	public Oficial(String nombre, String codigoString, String categoria) {
		super(nombre, codigoString);
		this.categoria = categoria;
		setValorHoras(13);
		
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Oficial [categoria=" + categoria + " codigoTaller=" + getCodigoTaller() + ", Nombre="+ getnombre()+"]";
	}
	
	
	
	
	}
	
	

	
}
