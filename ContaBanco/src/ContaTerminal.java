import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome, por favor! ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da agência, por favor. ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da conta, por favor. ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + " ,conta " + numeroConta + " e seu saldo R$:" + saldo + " já está disponível para saque.");


    }

}