public class ContaPoupanca extends Conta {

	// Construtor que inicializa uma ContaPoupanca com um cliente específico
	public ContaPoupanca(Cliente cliente) {
		super(cliente);  // Chama o construtor da classe pai (Conta)
	}

	// Implementação do método imprimirExtrato da interface IConta
	@Override
	public void imprimirExtrato() {
		// Imprime o cabeçalho específico para o extrato da Conta Poupança
		System.out.println("=== Extrato Conta Poupança ===");
		// Chama o método da classe pai para imprimir as informações comuns
		super.imprimirInfosComuns();
	}
}

