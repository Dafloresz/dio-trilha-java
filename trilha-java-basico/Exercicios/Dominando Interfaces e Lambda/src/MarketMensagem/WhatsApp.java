package MarketMensagem;

public class WhatsApp implements Dispositivo {
    @Override
    public String enviarMensagem(String mensagem) {
        return mensagem + "\n - enviado por WhatsApp -";
    }
}
