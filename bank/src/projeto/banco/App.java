package projeto.banco;

// Projeto simples de uma conta no banco que é iniciada com saldo zero
// E conforme o programa funciona o usuario adiciona e remove valores
// E retorna o saldo disponivel e novo saldo apos saque.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int decisao;
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);
        Client cliente1 = new Client();
        Home tela = new Home();

        System.out.println("Olá, seja bem-vindo. Para continuar seu cadastro, digite o seu nome abaixo: ");
        String name = scanner.next();
        cliente1.setFirstName(name);

        System.out.println(cliente1.getFirstName() + ", Aguarde um pouco...");
        cliente1.setNumber(102030);
        cliente1.setAgency(123);
        System.out.println("Sucesso! esses sao os dados de sua conta:\n" +
                "Nome: " + cliente1.getFirstName() + "\n" +
                "Agencia: " + cliente1.getAgency() + "\n" +
                "Conta :  " + cliente1.getNumber());

        System.out.println(tela.gettelaInicial());

        decisao = scanner.nextInt();

        while (continuar) {

            if (decisao == 1) {
                System.out.println("seu saldo eh: " + cliente1.getBalance() + "R$");
                System.out.println("Deseja realizar mais alguma operacao? digite 1 para sim e 0 para nao ");
                decisao = scanner.nextInt();
                if (decisao == 1) {
                    System.out.println(tela.gettelaInicial());
                    decisao = scanner.nextInt();
                    continue;
                } else {
                    continuar = false;
                    System.out.println("Programa finalizado com sucesso!");
                }
                continue;

            } else if (decisao == 2) {
                System.out.println("Digite o valor inserido(R$)");
                double valor = scanner.nextInt();
                cliente1.setBalance(cliente1.getBalance() + valor);
                System.out.println("Valor atualizado com sucesso!");
                System.out.println("Deseja realizar mais alguma operacao? digite 1 para sim e 0 para nao ");
                decisao = scanner.nextInt();
                if (decisao == 1) {
                    System.out.println(tela.gettelaInicial());
                    decisao = scanner.nextInt();
                    continue;
                } else {
                    continuar = false;
                    System.out.println("Programa finalizado com sucesso!");
                }
            } else if (decisao == 3) {
                System.out.println("Digite o valor que deseja sacar (R$): ");
                double saque = scanner.nextInt();
                if (saque > cliente1.getBalance()) {
                    System.out.println("Limite excedido... Porfavor, saque no maximo: " + cliente1.getBalance());
                } else {
                    cliente1.setBalance(cliente1.getBalance() - saque);
                    System.out.println("Saque realizado com sucesso");
                    System.out.println("Deseja realizar mais alguma operacao? digite 1 para sim e 0 para nao ");
                    decisao = scanner.nextInt();
                    if (decisao == 1) {
                        System.out.println(tela.gettelaInicial());
                        decisao = scanner.nextInt();
                        continue;
                    } else {
                        continuar = false;
                        System.out.println("Programa finalizado com sucesso!");
                    }
                }
            }
        }
    }
}

