package ejercicio2;

public class Padre {
	
	private final int edadJubilacion = 65;

	public Padre() {

	}
	@Deprecated
	public double factura (double a) {
		
		return a;
	}
	
	
	public double factura (double a, double b) {
		
		return a + b + 20.0;
	}
	
	@Deprecated
	public int anyosJubilacion (int edad) {
		
		return edadJubilacion - edad;
	}
	
	public int anyosJubilacion (int edad, int supl) {
		
		return edadJubilacion - edad + supl;
	}
	
	
		
	}

