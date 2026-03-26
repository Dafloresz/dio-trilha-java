package interfaces;

public interface AparelhoTelefonico {

    public void ligar(String numero);
    public void atender();
    public void recusarLigacao();
    public void iniciarCorreioDeVoz();

    void adicionarContato(String contato);
    void removerContato(String contato);
    void enviarEmailContato(String mensagem, String contato);


}
