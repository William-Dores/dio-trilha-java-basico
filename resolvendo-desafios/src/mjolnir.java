import java.util.Scanner; 

public class mjolnir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        String nome;
        int N;

        for(int i = 1; i <= C && C <= 25000; i++){
            nome = sc.next();
             N = sc.nextInt();
             sc.nextLine();
            if (nome.equals("Thor")) {
                System.out.println("Y");
            }
            else 
                System.out.println("N");
        }

    }
}
