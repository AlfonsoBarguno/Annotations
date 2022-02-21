package ejercicio2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Padre p = new Padre();
		
		System.out.println(p.factura(10.0));
		System.out.println(p.factura(10.0, 3.2));
		
		System.out.println(p.anyosJubilacion(30));
		System.out.println(p.anyosJubilacion(30, 4));
		
	}

}
