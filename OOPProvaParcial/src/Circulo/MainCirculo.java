package Circulo;

public class MainCirculo {

	public static void main(String[] args) {
		Circulo c = new Circulo();
		c.setRaio(2.00);
		System.out.println("Raio = " + c.getRaio() + 
				"\nArea = " + c.area() +
				"\nPerimetro = " + c.perimetro());

	}

}
