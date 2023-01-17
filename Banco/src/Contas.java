
public abstract class Contas implements IConta{

    private static final String AGENCIA_PADRAO = "0107-50";
    private static  int SEQUENCIAL = 1;
 
    protected String agencia;

    protected int numConta;

    protected double saldo;

    

    public Contas() {
        this.agencia = AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
    }
    
    protected void imprimirExtrato(){
        System.out.println();
        System.out.println("Agencia: "+ this.agencia );
        System.out.println(String.format("Numero Conta: %d", this.numConta));
        System.out.println(String.format("Saldo : %.2f", this.saldo));
        System.out.printf("_______________________________________");
        System.out.println();
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -=  valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Contas contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    @Override
    public double saldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }



    
}