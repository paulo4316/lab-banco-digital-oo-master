import java.util.List;

public class Banco {

	// Atributo que armazena o nome do banco
	private String nome;

	// Lista que armazena todas as contas associadas ao banco
	private List<Conta> contas;

	// Método getter para obter o nome do banco
	public String getNome() {
		return nome;
	}

	// Método setter para definir o nome do banco
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método getter para obter a lista de contas do banco
	public List<Conta> getContas() {
		return contas;
	}

	// Método setter para definir a lista de contas do banco
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}

