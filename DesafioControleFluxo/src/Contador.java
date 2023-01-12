import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmentro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro1");
        int parametroDois = terminal.nextInt();
    

        terminal.close();
        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException exception) {
        
            System.out.println("O segundo parâmetro deve ser Maior que o primeiro");
        }
    }

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;
    for(int i = 1; i <= contagem; i++){
        System.out.println("IMPRIMINDO NUMERO " + i);
    } 
  }
}
