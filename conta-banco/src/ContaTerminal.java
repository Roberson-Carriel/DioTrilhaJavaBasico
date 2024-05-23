import java.util.Scanner;
    public class ContaTerminal {
        public static void main(String[] args) throws Exception {

            Scanner terminal = new Scanner(System.in);

            int numero;
            String agencia;
            String nomeCliente;
            Double saldo;

            System.out.println("Digite seu nome: ");
            nomeCliente = terminal.nextLine();

            System.out.println("Por favor digite o número de sua agência: ");
            agencia = terminal.next();

            System.out.println("Por favor digite o número da conta: ");
            numero = terminal.nextInt();

            System.out.println("Por favor digite seu saldo: ");
            saldo = terminal.nextDouble();
           

            System.out.printf("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia + ", conta: "+ numero + " e seu saldo: "+ saldo + " já está disponivel para saque.");
   
        }
    }