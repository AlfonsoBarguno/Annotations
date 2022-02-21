package ejercicio1;

public class Main {

	public static void main(String[] args) {

		
		Hijo h1 = new Hijo();
		h1.setImporte(120.3);
		System.out.println("La factura sin IVA tiene un importe de " + h1.getImporte());
		System.out.println("La factura con IVA tiene un importe de " + h1.factura(h1.getImporte()));
		
		Hija h2 = new Hija();
		h2.setImporte(140);
		System.out.println("La factura sin IVA es de " + h2.getImporte());
		System.out.println("Esta factura no tiene IVA, por lo tanto es de " + h2.factura(h2.getImporte()));

	}

}
