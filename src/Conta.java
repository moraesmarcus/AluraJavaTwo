public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	// M�todo de dep�sito
	public void depositar(double valor){
		this.saldo += valor;		
	}
	
	// M�todo de saque
	public boolean sacar(double valor) {
		// verifica se a conta tem saldo para sacar
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;				
	}
	
	public boolean transferir(double valor, Conta destino) {
		// s� deposita na conta destino depois de sacar da conta origem
		if(this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
	    return false;
	}
}