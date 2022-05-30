prackage Proyecto Ejercicio;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		empleados.add(new Empleado("Diego"));
		empleados.add(new Empleado("Raquel"));
		empleados.add(new Tecnico("Diego", "123"));
		empleados.add(new Tecnico("Raquel", "123"));
		empleados.add(new Directivo("Diego", "Madrid"));
		empleados.add(new Directivo("Raquel", "Sevilla"));
		
		empleados.add(new Oficial("Diego", "123", "IT"));
		empleados.add(new Oficial("Raquel", "123", "IT"));
		empleados.add(new Operario("Diego", "123", "pc"));
		empleados.add(new Operario("Raquel", "123", "pc"));
		
		for(Empleado emp: Empleados) {
			System.out.println(emp);
			System.out.println(emp.calcularSalario(10));
			System.out.println("");
			
		}
		
		
	}
	
	
	
}
