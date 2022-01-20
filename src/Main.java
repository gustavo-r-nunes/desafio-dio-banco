
public class Main {
	
	
	public static void main(String[] args) {
		
		Banco banco1 = new Banco("Banco Santana");
		Agencia agenciaSantana1 = new Agencia(banco1, 1);
		banco1.adicionarAgencia(agenciaSantana1);
		Agencia agenciaSantana2 = new Agencia(banco1, 2);
		banco1.adicionarAgencia(agenciaSantana2);
		
		Banco banco2 = new Banco("Banco Italu");
		Agencia agenciaItalu1 = new Agencia(banco2, 1);
		banco2.adicionarAgencia(agenciaItalu1);
		Agencia agenciaItalu2 = new Agencia(banco2, 2);
		banco2.adicionarAgencia(agenciaItalu2);

		ContaCorrente contaSantana1 = new ContaCorrente(agenciaSantana1,new Cliente("Joao da Silva", agenciaSantana1));
		ContaCorrente contaSantana2 = new ContaCorrente(agenciaSantana2, new Cliente("Maria Aparecida", agenciaSantana2));
		
		ContaPoupanca contaItalu1 = new ContaPoupanca(agenciaItalu1, new Cliente("Pedro Oliveira", agenciaItalu1));
		ContaPoupanca contaItalu2 = new ContaPoupanca(agenciaItalu2, new Cliente("Joana Almeida", agenciaItalu2));
	
		
		contaSantana1.depositar(100);
		contaSantana1.imprimirExtrato();
		
		contaSantana1.transferencia(contaSantana2, 30);
		contaSantana2.imprimirExtrato();
		
		contaItalu1.depositar(1500);
		contaItalu1.imprimirExtrato();
		
		contaItalu1.transferencia(contaItalu2, 500);
		contaItalu2.imprimirExtrato();
		
		contaItalu1.sacar(300);
		contaItalu1.imprimirExtrato();
		
		
		
	    
	}
	
}