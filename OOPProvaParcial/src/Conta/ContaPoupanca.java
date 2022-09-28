package Conta;

public class ContaPoupanca extends Conta {
	private double rendimento;

	public ContaPoupanca(double saldo, double rendimento) {
		super(saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public double CalculaRendimento() {
		double r = getSaldo() * this.rendimento;
		return r;
	}
	
}
