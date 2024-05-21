public abstract class Conta implements IConta {

	// Constante que define a agência padrão
	private static final int AGENCIA_PADRAO = 1052;
	// Variável estática que mantém o número sequencial das contas
	private static int SEQUENCIAL = 1;

	// Atributo que armazena o número da agência da conta
	protected int agencia;
	// Atributo que armazena o número da conta
	protected int numero;
	// Atributo que armazena o saldo da conta
	protected double saldo;
	// Atributo que armazena o cliente associado à conta
	protected Cliente cliente;

	// Construtor que inicializa a conta com um cliente específico
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO; // Define a agência padrão
		this.numero = SEQUENCIAL++;          // Atribui o próximo número sequencial à conta
		this.cliente = cliente;              // Associa o cliente à conta
	}

	// Implementação do método sacar da interface IConta
	@Override
	public void sacar(double valor) {
		saldo -= valor; // Subtrai o valor do saldo
	}

	// Implementação do método depositar da interface IConta
	@Override
	public void depositar(double valor) {
		saldo += valor; // Adiciona o valor ao saldo
	}

	// Implementação do método transferir da interface IConta
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);                // Saca o valor da conta atual
		contaDestino.depositar(valor);    // Deposita o valor na conta de destino
	}

	// Método getter para obter a agência da conta
	public int getAgencia() {
		return agencia;
	}

	// Método getter para obter o número da conta
	public int getNumero() {
		return numero;
	}

	// Método getter para obter o saldo da conta
	public double getSaldo() {
		return saldo;
	}

	// Método protegido que imprime as informações comuns da conta
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
