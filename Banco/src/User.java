
public class User {

    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.toString();

    
        ContaCorrente CC = new ContaCorrente();
        ContaCorrente CC2 = new ContaCorrente();
        ContaPoupanca CP = new ContaPoupanca();

        CC.depositar(120);
        CC.imprimirExtrato();
        CC.transferir(50, CP);
        
        CC2.imprimirExtrato();
        
        CP.imprimirExtrato();
        CC.imprimirExtrato();
    }
}
