import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor digite o numero da agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor digite o número da conta;");
        int conta = scanner.nextInt();

        double saldo = 25;

        System.out.println("Olá " + nome +", obrigado pr criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +", seu saldo é " + saldo + " já está disponivel para saque.");
      

    }
}
