
public class Bola {

	String cor;
	double tamanho;
	
	public Bola(String cor, double tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public Bola maiorBola(Bola x, Bola y) {
		if(x.tamanho > y.tamanho) {
			return x;
		} else if(x.tamanho == y.tamanho) {
			System.out.println("As duas bolas tem o mesmo tamanho");
			return x;
		}
		else {
			return y;
		}
	}

	
	public Bola retornarDados() {
		Bola aux = new Bola(this.cor, this.tamanho);
		return aux;
	}

	@Override
	public String toString() {
		return " \nCor = " + cor + " | Raio = " + tamanho;
	}
}