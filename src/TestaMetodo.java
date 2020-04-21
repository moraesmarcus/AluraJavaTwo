
// classe para teste dos metodos criados dentro da classe Conta
public class TestaMetodo {
	
	public static void main(String[] args) {
	   // inicialização da conta do Marcus
	   Conta contaDoMarcus = new Conta();
	   contaDoMarcus.titular = "Marcus";				
	   contaDoMarcus.saldo = 1000;
	   
	   imprimirSaldo(contaDoMarcus);
	   
	   // Depositando 500 reais na conta do Marcus
	   contaDoMarcus.depositar(500);
	
	   imprimirSaldo(contaDoMarcus);
	   
	   // Sacando com saldo válido
	   if(!contaDoMarcus.sacar(50)) {
		   imprimirErro();
	   };
	   
	   imprimirSaldo(contaDoMarcus);
	   
	   // Sacando com saldo inválido
	   if(!contaDoMarcus.sacar(5000)) {
		   imprimirErro();
	   };
	   
	   imprimirSaldo(contaDoMarcus);
       
	   // Inicializando favorecido
	   Conta contaDaNath = new Conta();
	   contaDaNath.saldo = 8000;
	   contaDaNath.titular = "Nathália";
	   
	   imprimirSaldo(contaDaNath);
	   // transferindo com saldo
	   if(!contaDoMarcus.transferir(1200, contaDaNath)) {
		   imprimirErro();
	   }
	   
	   imprimirSaldo(contaDoMarcus);
	   imprimirSaldo(contaDaNath);
	   // transferindo sem saldo
	   if(!contaDoMarcus.transferir(8000, contaDaNath)) {
		   imprimirErro();
	   }
	   
	   imprimirSaldo(contaDoMarcus);
	   imprimirSaldo(contaDaNath);
	   
	}			
	
	// impressão de erro no saldo			
	private static void imprimirErro() {
		System.out.println("Sem Saldo para operação!");
	}

	//impressão de saldo em tela
	public static void imprimirSaldo(Conta conta) {			
		System.out.println("Saldo da conta do " + conta.titular + ": " + conta.saldo);
	}
		

}
