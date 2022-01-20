
public class ContaCorrente extends Conta {
	
	private static int SEQUENCIAL = 1;
	
	private final int tipo = 1;
	
	
	public ContaCorrente(Agencia agencia, Cliente cliente) {
		super.agencia = agencia;
		super.numero = SEQUENCIAL++;
		super.cliente = cliente;
	}
	
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		System.out.println("Agência: " + agencia.getNumero());
		System.out.println("Numero: " + numero);
		System.out.println(String.format("Saldo: %.2f", super.saldo));
	}

	public int getTipo() {
		return tipo;
	}
	
	
	

	
	

}
