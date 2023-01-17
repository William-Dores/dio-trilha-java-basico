public class Banco {
    private String nome = "MEU BANCO MEU AMOR";

    public String imprimirNome(){
        System.out.println("===================");
        System.out.println(nome);
        System.out.println("===================");
        System.out.println();
         return nome;

    }

    @Override
    public String toString() {
        return imprimirNome();

    }

}
