
public interface IConta {

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Contas contaDestino);

    public double saldo();
}