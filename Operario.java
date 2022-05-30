package ProyectoEjercicio;
public class Operario extends Tecnico {

	private String maquinaria;
	
	public Operario(String nombre, String codigoTaller, String maquinaria) {
		super(nombre, codigoTaller);
		this.maquinaria = maquinaria;
	}
	
	public String getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(String maquinaria) {
		this.maquinaria = maquinaria;
	}

	@Override
	public String toString() {
		return "Operario [maquinaria=" + maquinaria + "codigoTaller=" + getCodigoTaller() +", Nombre="+ getNombre()+"]";
	}


	
	
	
	
}
