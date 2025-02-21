package ContaCliente;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao nosso banco!");
        System.out.println("Vamos precisar de algumas informações sua");

        //Solicitando e capturando os dados do usuário

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();


        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Qual a quantia você deseja depositar?: ");
        double saldo = scanner.nextDouble();

        System.out.println("Óla "+ nomeCliente +", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia +",conta "+ numero + " e seu saldo "+ saldo + " já esta disponivel para saque!");

        scanner.close();
    }

}
