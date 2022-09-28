package Conta;

public class Conta {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldoDeposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void setSaldoSaque(double saldo) {
		if(saldo > this.saldo) {
			System.out.println("Não há saldo suficiente para saque");
		} else {
			this.saldo -= saldo;
		}
	}

	public Conta(double saldo) {
		if(0 > saldo) {
			System.out.println("Não foi possível criar conta");
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
		}
	
}
