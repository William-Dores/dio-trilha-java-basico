import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //IMPORTANDO A CLASSE ESCANNER
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        // DECLARAÇÃO DAS VARIAVEIS E EXIBIÇÃO DAS MENSAGENS
        System.out.print("Digite seu nome por gentileza: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite agora o numero da agencia: ");
        String numeroAgencia = sc.nextLine();
        System.out.print("Agora digite o valor a inserir na conta: ");
        double saldo = sc.nextDouble();

        //MENSAGENS PARA O USUARIO
        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo " + String.format("%.2f", saldo)+ " já está disponivel para saque.");

    }
}
