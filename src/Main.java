import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Conta c = new Conta();
        System.out.println("Olá seja bem-vindo");
        System.out.println("Informe seu nome completo");
        c.nomeTitular = leitor.nextLine();
        c.Validacao();
        c.Informacoes();
        while (c.rodando) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Informações");
            System.out.println("2 - Consultar Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sair");
            System.out.println();
            c.escolha = leitor.nextInt();

            switch (c.escolha) {
                case 1:
                    c.Informacoes();
                    break;

                case 2:
                    c.Consultar();
                    break;

                case 3:
                    c.Saque();
                    break;

                case 4:
                    c.Depositar();
                    break;

                case 5:
                    System.out.println("Fim do Programa");
                    c.rodando = false;
                    break;

                default:
                    System.out.println("Opção Invalida");
            }
        }
    }
}
