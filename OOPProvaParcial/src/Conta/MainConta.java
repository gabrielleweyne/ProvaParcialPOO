package Conta;

public class MainConta {

	public static void main(String[] args) {
		Conta[] c = new Conta[2];
		
		c[0] = new ContaCorrente(2.00, 0.25);
		c[1] = new ContaPoupanca(4.35, 1.10);
		
		for(int i = 0; i < 2; i++) {
			try {
				System.out.println("Saldo da conta conrrente (" + i + "): " + ((ContaCorrente)c[i]).getSaldo());
			} catch (Exception e) {
				System.out.println("Saldo da conta poupanca ("+ i + "): " + ((ContaPoupanca)c[i]).CalculaRendimento());
			}
		}
	}

}
