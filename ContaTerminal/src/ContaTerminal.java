import java.util.Scanner;

import Conta.ContaUsuario;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá usuário. Por favor, digite o número da sua numero da conta");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora digite sua agencia");
        String agencia = scanner.nextLine();
        System.out.println("Agora digite o seu nome");
        String nome = scanner.nextLine();
        System.out.println("Agora digite o seu saldo");
        double saldo =  scanner.nextDouble();
        scanner.close();
        
        ContaUsuario usuario = new ContaUsuario(numeroConta, agencia, nome, saldo);
        System.out.println("Ola " + usuario.getNomeCliente()+", o seu saldo de " + usuario.getSaldo() + " da conta " + usuario.getNumeroConta() + " da agencia " + usuario.getAgencia() + " já esta disponível");
    }
}
