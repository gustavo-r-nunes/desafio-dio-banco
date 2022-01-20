
public abstract class Conta {
	
    protected Agencia agencia;
	
	protected int numero;
	
	protected double saldo;
	
	protected Cliente cliente;
	
	


	public void sacar(double valor) {
		saldo -= valor;
	};
	
	public void depositar(double valor) {
		saldo += valor;
	};
	
	public void transferencia(Conta contaDestino, double valor) {
	    	saldo -= valor;		
		    contaDestino.depositar(valor);
		
	}
	

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	};
	
	

}
