
public class Main {

	public static void main(String[] args) {
		Cliente Silvia = new Cliente();
		Silvia.setNome("Silvia");
		
		Conta cc = new ContaCorrente(Silvia);
		Conta poupanca = new ContaPoupanca(Silvia);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
