import java.util.Scanner;

public class Conta {

    int numeroConta = 1234;
    int agenciaConta = 123456;
    String nomeTitular;
    double saldoAtual = 0;
    double saqueConta;
    double depositarConta;
    int escolha;
    boolean rodando = true;
    private double limiteConta = 1200;
    Scanner leitor = new Scanner(System.in);

    
    public void Informacoes(){
        System.out.println();
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Agencia: " + agenciaConta);
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Limite da Conta: " +getLimiteConta());
    }


    public void Consultar(){
        System.out.println("Seu saldo é:" + saldoAtual);
    }

    public void Saque(){

        System.out.println("Voce pode sacar até: " + (saldoAtual = saldoAtual + getLimiteConta()));
        System.out.println();
        System.out.println("Quanto deseja sacar?");
        saqueConta = leitor.nextDouble();
        while (saqueConta < 0) {
            System.out.println("Valor Invalido");
            saqueConta = leitor.nextDouble();
        }
        while (saldoAtual - saqueConta < -getLimiteConta()) {
            System.out.println("Não é possivel sacar mais que seu limite");
            System.out.println("Digite Novamente:");
            saqueConta = leitor.nextDouble();
        }
        saldoAtual = saldoAtual - saqueConta;
        System.out.println("Saldo atual:" + saldoAtual);
    }

    public void Depositar(){
        System.out.println("Quanto deseja depositar?");
        depositarConta = leitor.nextDouble();
        saldoAtual = saldoAtual + depositarConta;
        System.out.println("Saldo atual:" + saldoAtual);
    }

    public void Validacao () {
    while (nomeTitular == null || nomeTitular.trim().isEmpty() || !nomeTitular.matches("[a-zA-Z]+")) {
            System.out.println("Nome invalido, digite novamente");
            nomeTitular = leitor.nextLine();
        }
    }

    public double getLimiteConta() {
        return limiteConta;
    }
}
