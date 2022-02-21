package ejercicio1;

public class Hijo extends Padre {

	private double importe;
	private int edad;

	public Hijo() {

	}

	@Override
	public double factura(double a) {

		return (a * 20 / 100) + a;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
