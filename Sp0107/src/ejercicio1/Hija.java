package ejercicio1;

public class Hija extends Padre {
	
	private double importe;
	private String nombre;
	
	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Hija() {
		
	}

	@Override
	public double factura(double a) {
		
		return a;
	}
	

}
