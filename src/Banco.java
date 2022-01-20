import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	
	private List<Agencia> agencias = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public void adicionarAgencia(Agencia agencia) {
		agencias.add(agencia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(List<Agencia> agencias) {
		this.agencias = agencias;
	}
	


}
