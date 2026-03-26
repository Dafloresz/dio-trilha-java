package MarketMensagem;

public class SMS implements Dispositivo {

    @Override
    public String enviarMensagem(String mensagem) {
        return mensagem + "\n - enviado por SMS -";
    }
}
