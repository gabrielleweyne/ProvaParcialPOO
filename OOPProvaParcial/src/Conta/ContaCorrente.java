package Conta;

public class ContaCorrente extends Conta {
	private double taxa;

	public ContaCorrente(double saldo, double taxa) {
		super(saldo);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void setSaldoDeposito(double saldo) {
			saldo -= (saldo - taxa);
			super.setSaldoDeposito(saldo);
	}

	@Override
	public void setSaldoSaque(double saldo) {
			saldo += (saldo - taxa);
			super.setSaldoSaque(saldo);
	}
	
	
	
}
