package MarketMensagem;

public class Email implements Dispositivo {
    @Override
    public String enviarMensagem(String mensagem) {
        return mensagem + "\n - enviado por Email -";
    }
}
