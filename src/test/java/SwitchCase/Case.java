package SwitchCase;
import java.util.Scanner;

public class Case {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Companhia Aérea Flash de Turismo!");

        String[] destinos = {"Londres", "Munique", "Las Vegas", "Toronto", "Nova York", "Manaus"};

        System.out.println("Destinos disponíveis:");
        for (int i = 0; i < destinos.length; i++) {
            System.out.println((i + 1) + ". " + destinos[i]);
        }

        System.out.print("Escolha o número correspondente ao destino desejado: ");
        int escolhaDestino = scanner.nextInt();

        if (escolhaDestino < 1 || escolhaDestino > destinos.length) {
            System.out.println("Escolha inválida. Saindo do programa...");
            return;
        }

        System.out.print("Digite a data da viagem (dd/mm/aaaa): ");
        String dataViagem = scanner.next();

        int custoPassagem;

        switch (escolhaDestino) {
            case 1:
            case 2:
            case 3:
                custoPassagem = 4000;
                break;
            default:
                custoPassagem = 1500;
                break;
        }

        System.out.println("\nDetalhes da sua viagem:");
        System.out.println("Destino: " + destinos[escolhaDestino - 1]);
        System.out.println("Data da viagem: " + dataViagem);

        System.out.println("\nOpções de pagamento:");
        System.out.println("1. Pagamento à vista");
        System.out.println("2. Parcelamento em até 10x sem juros");

        System.out.print("Escolha a forma de pagamento (1 ou 2): ");
        int formaPagamento = scanner.nextInt();

        switch (formaPagamento) {
            case 1:
                System.out.println("Valor total da passagem: R$" + custoPassagem);
                break;
            case 2:
                int valorParcela = custoPassagem / 10;
                System.out.println("Valor total da passagem: R$" + custoPassagem);
                System.out.println("Parcelado em 10x sem juros de R$" + valorParcela);
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }

        scanner.close();
    }
}

