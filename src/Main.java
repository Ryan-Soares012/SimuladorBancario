import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Ryan Soares";
        double saldo = 1250;
        String tipoConta = "Corrente";
        int opcao = 0;
        double deposito;
        double saque;

        System.out.println("******************************************");
        System.out.printf("Dados iniciais do cliente:%n%n");
        System.out.printf("Nome do cliente: %s %n", nome);
        System.out.printf("Tipo de conta: %s %n", tipoConta);
        System.out.printf("Saldo inicial do cliente: R$ %.2f %n %n", saldo);
        System.out.printf("****************************************** %n%n");
        while (opcao != 4) {
            System.out.printf("Operações: %n%n");
            System.out.printf("1- Consultar saldos %n2- Fazer depósito %n3- Fazer saque %n4- Sair%n%n");
            System.out.println("Digite sua opção desejada:");
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.printf("O saldo atual é R$ %.2f%n%n", saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor que deseja depositar:");
                deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.printf("Saldo da conta atualizado: R$ %.2f%n%n", saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja sacar:");
                saque = leitura.nextDouble();
                if (saldo >= saque) {
                    saldo -= saque;
                    System.out.printf("Saldo da conta atualizado: R$ %.2f%n%n", saldo);
                } else {
                    System.out.printf("Não há saldo suficiente para realizar esta operação%n%n");
                }
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar o aplicativo!");
            } else {
                System.out.printf("Opção inválida.%n%n");
            }
        }
    }
}