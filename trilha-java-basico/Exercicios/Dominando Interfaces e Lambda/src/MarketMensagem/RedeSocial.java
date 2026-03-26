package MarketMensagem;

public class RedeSocial implements Dispositivo {
    @Override
    public String enviarMensagem(String mensagem) {
        return mensagem + "\n - enviado por Rede Social -";
    }
}
