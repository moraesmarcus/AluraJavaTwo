
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
	 	
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println(segundaConta.saldo);
		System.out.println("A primeira conta tem o saldo de " + primeiraConta.saldo);
		System.out.println("A segunda conta tem o saldo de " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		
		System.out.println("Agora a segunda conta está na agencia "
				+ segundaConta.agencia);
		
		
		
	}
} 
