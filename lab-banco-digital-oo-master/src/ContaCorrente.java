public class ContaCorrente extends Conta {

	// Construtor que inicializa uma ContaCorrente com um cliente específico
	public ContaCorrente(Cliente cliente) {
		super(cliente);  // Chama o construtor da classe pai (Conta)
	}

	// Implementação do método imprimirExtrato da interface IConta
	@Override
	public void imprimirExtrato() {
		// Imprime o cabeçalho específico para o extrato da Conta Corrente
		System.out.println("=== Extrato Conta Corrente ===");
		// Chama o método da classe pai para imprimir as informações comuns
		super.imprimirInfosComuns();
	}

}
