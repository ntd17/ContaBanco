import java.util.Scanner;
import java.math.BigDecimal;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;
        
        System.out.println("Por favor, digite o número da conta!");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da agência!");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial da conta!");
        saldo = scanner.nextBigDecimal();
        scanner.nextLine();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                           ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
