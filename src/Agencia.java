import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private Banco banco;
	
	private List<Cliente> clientes = new ArrayList<>();
	
	private int numero;
	
	public Agencia(Banco banco, int numero) {
		this.banco = banco;
		this.numero = numero;
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
