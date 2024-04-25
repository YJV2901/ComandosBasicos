package IF;

import java.util.Scanner;

public class AprendendoIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		// < menor que
		// > maior que
		// = igual 
		// || ou 
		// >= maior ou igual
		// <= menor ou igual
		// != diferente ou igual
		// &
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Bem vindo ao Banco Champions");
		System.out.println("Digite o valor do boleto a ser pago: ");
		
		int boleto = scanner.nextInt();
		System.out.println("Digite o seu saldo no momento:");
		int saldo = scanner.nextInt();
		int limite = 200;
		int saldoelimite = saldo + limite;
		
		System.out.println("Bem vindo a área de pagamento de boleto");
		int saldofinal = saldo - boleto;
		if (boleto <= saldoelimite) {
			System.out.println("Boleto pago com sucesso");
			System.out.println("Seu saldo após o pagamento do boleto é de " + saldofinal + ". Seu limite do cheque especial é de " + limite);
		} else {
			System.out.println("Saldo insulficiente");
		
		}
		
		
	}

}
