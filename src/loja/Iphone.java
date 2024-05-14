package loja;

import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorDigital;

public class Iphone implements AparelhoTelefonico, ReprodutorDigital, NavegadorInternet{

    @Override
    public void atender() {
        System.out.println("Atendendo");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba de Navegação");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
        
    }

    
}
