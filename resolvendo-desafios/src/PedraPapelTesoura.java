import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o numero de jogador: ");
        int N = leitor.nextInt();
        leitor.nextLine();
        String jogador1, jogador2;
        

        for(int i = 1; i <= N && N <= 1000; i++){
        System.out.printf("jogador 1:");
        jogador1 = leitor.next();
        System.out.printf("Jogador 2:");
        jogador2 = leitor.next();
            
            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) {
                System.out.println("Aniquilição mutua");
            } 
            else if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("Ambos venceram");
            }   
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 1 venceu");
            }
            else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("papel")) {
                System.out.println("jogador 2 venceu");
            }
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) {
                System.out.println("jogador 1 venceu");
            }
            else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra")) {
                System.out.println("jogador 2 venceu");
            }
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("jogador 1 venceu");
            }
            else if (jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 2 venceu");
            }
            else{
                System.out.println("Sem ganhador");
            }        
        }

    }
}
