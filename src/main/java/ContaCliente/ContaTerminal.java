package ContaCliente;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao nosso banco!");
        System.out.println("Vamos precisar de algumas informações sua");
        //Solicitando e capturando os dados do usuário

        System.out.println("Por favor, digite o número da conta: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();
    }

}
