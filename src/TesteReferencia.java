
public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		//altere igual ao de baixo para ver a diferença
		//Conta segundaConta = primeiraConta;
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		System.out.println(segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("contas iguais");
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}else {
			System.out.println("contas diferentes");
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
	}
}
