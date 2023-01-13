package Celular;

import aparelho.AparelhoTelefonico;
import musica.ReprodutorMusical;
import navegador.NavegadorDaInternet;

public class TelefoneCelular implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA");
        
    }

    @Override
    public void adicionarPagina() {
        System.out.println("ADICIONANDO UMA PAGINA");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");        
    }

    @Override
    public void ligarr() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");        
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
        
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");        
    }

    
}