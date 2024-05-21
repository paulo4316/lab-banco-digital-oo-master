public class Main {

	public static void main(String[] args) {
		// Cria um novo cliente chamado Paulo
		Cliente Paulo = new Cliente();
		Paulo.setNome("Paulo");  // Define o nome do cliente como Paulo

		// Cria uma conta corrente associada ao cliente Paulo
		Conta cc = new ContaCorrente(Paulo);
		// Cria uma conta poupança associada ao mesmo cliente Paulo
		Conta poupanca = new ContaPoupanca(Paulo);

		// Deposita 100 unidades monetárias na conta corrente
		cc.depositar(100);
		// Transfere 100 unidades monetárias da conta corrente para a conta poupança
		cc.transferir(100, poupanca);

		// Imprime o extrato da conta corrente
		cc.imprimirExtrato();
		// Imprime o extrato da conta poupança
		poupanca.imprimirExtrato();
	}

}

