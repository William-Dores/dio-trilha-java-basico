import Celular.TelefoneCelular;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        TelefoneCelular cell = new TelefoneCelular();
        System.out.println("FUNÇÕES DO REPRODUTOR MUSICIAL:");
        cell.tocar();
        cell.pausar();
        cell.selecionarMusica();

        System.out.println();
        System.out.println("FUNÇOES DO APARELHO TELEFÔNICO:");
        cell.ligarr();
        cell.atender();
        cell.iniciarCorreioVoz();

        System.out.println();
        System.out.println("FUNÇÕES NAVEGANDO PELA INTERNET:");
        cell.exibirPagina();
        cell.adicionarPagina();
        cell.atualizarPagina();
        
    }
}
