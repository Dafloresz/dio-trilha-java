import interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Camera, NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    private boolean estaEmLigacao;
    private List<String> contatos;

    public Iphone(){
        estaEmLigacao = false;
        contatos = new ArrayList<>();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        estaEmLigacao = true;

    }

    @Override
    public void atender() {
        System.out.println("Ligação aceita!");

    }

    @Override
    public void recusarLigacao() {
        System.out.println("Ligação recusada!");
    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void adicionarContato(String contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato);

    }

    @Override
    public void removerContato(String contato) {
        contatos.remove(contato);
        System.out.println("Contato removido: " + contato);

    }

    @Override
    public void enviarEmailContato(String mensagem, String contato) {
        System.out.println("Enviando: " + mensagem + "\nPara: " + contato) ;

    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando Foto!");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba atualizada!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");

    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando: " + musica);

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
        tocar(musica);
    }
}
