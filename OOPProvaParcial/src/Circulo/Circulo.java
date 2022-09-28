package Circulo;

public class Circulo {
	 private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		double area = Math.PI * (this.raio * this.raio);
		return area;
	}
	
	public double perimetro() {
		double perimetro = Math.PI * this.raio * 2;
		return perimetro;
	}
}
