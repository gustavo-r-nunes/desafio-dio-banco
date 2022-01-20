
public class ContaPoupanca extends Conta{
	
	private static int SEQUENCIAL = 1;
	
	private final int tipo = 2;
	
	public ContaPoupanca(Agencia agencia, Cliente cliente) {
		super.agencia = agencia;
		super.numero = SEQUENCIAL++;
		super.cliente = cliente;
	}
	
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA POUPANCA ===");
		System.out.println("Agência: " + agencia.getNumero());
		System.out.println("Numero: " + numero);
		System.out.println(String.format("Saldo: %.2f", super.saldo));
	}

	public int getTipo() {
		return tipo;
	}
	

	
	

}
