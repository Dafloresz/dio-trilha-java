package Carro;

public class Carro {
    private final double VELOCIDADE_MAXIMA = 120;
    private final double VELOCIDADE_MINIMA = 0;
    private final int TOTAL_MARCHA = 6;

    private boolean ligado;
    private double velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligarCarro() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Carro já está ligado!");
        }
    }

    public void desligarCarro() {
        if(!ligado){
            System.out.println("O carro já está desligado!");
        } else if (marcha != 0) {
            System.out.println("Coloque o carro em ponto morto antes de desligar!");
        } else if (velocidade !=0 ) {
            System.out.println("O carro precisa estar parado!");
        } else {
            ligado = false;
            System.out.println("Carro desligado!");
        }
    }
    private double limiteMaximoMarcha(int marcha) {
        return marcha * 20;
    }

    private double limiteMinimoMarcha(int marcha) {
        if (marcha <= 1) return 0;
        return (marcha - 1) * 20 + 1;
    }


    public void acelerarCarro() {
        if(!ligado){
            System.out.println("Ligue o carro primeiro!");
            return;
        }

        if (marcha == 0){
            System.out.println("Coloque uma marcha para acelerar!");
            return;
        }

        if (velocidade > limiteMaximoMarcha(marcha)) {
            System.out.println("Limite da " + marcha + "ª marcha atingido (" +
                    (int) limiteMaximoMarcha(marcha) + "km/h). Troque de marcha!");
            return;
            }

        velocidade += 1;
        System.out.println("Velocidade aumentada para " + (int) velocidade + " km/h.");

    }

    public void freiarCarro() {
        if (!ligado){
            System.out.println("Ligue o carro primeiro!");
            return;
        }
        if (velocidade <= VELOCIDADE_MINIMA){
            System.out.println("O carro já está parado!");
            return;
        }
        velocidade = velocidade - 1;
        System.out.println("Velocidade reduzida para " + (int) velocidade + " km/h.");
    }

    public double checarVelocidade() {
        return velocidade;
    }

    public void aumentarMarcha() {
        if (!ligado){
            System.out.println("Ligue o carro primeiro!");
            return;
        }

        if (marcha >= TOTAL_MARCHA){
            System.out.println("Já está na marcha máxima (" + TOTAL_MARCHA + ")!");
            return;
        }
        int proximaMarcha = marcha + 1;
        if (velocidade < limiteMinimoMarcha(proximaMarcha)) {
            System.out.println("Velocidade muito baixa para engatar a " + proximaMarcha + "ª marcha. " +
                    "Mínimo: " + (int) limiteMinimoMarcha(proximaMarcha) + " km/h.");
            return;
        }
        marcha++;
        System.out.println("Marcha trocada para " + marcha + "ª!");
    }

    public void reduzirMarcha() {
        if (!ligado) {
            System.out.println("Ligue o carro primeiro!");
            return;
        }
        if (marcha <= 0) {
            System.out.println("Já está em ponto morto!");
            return;
        }
        int marchaAnterior = marcha - 1;
        if (marchaAnterior > 0 && velocidade > limiteMaximoMarcha(marchaAnterior)) {
            System.out.println("Velocidade alta demais para reduzir para a " + marchaAnterior + "ª marcha. " +
                    "Máximo: " + (int) limiteMaximoMarcha(marchaAnterior) + " km/h.");
            return;
        }
        marcha--;
        String nomemarcha = (marcha == 0) ? "ponto morto" : marcha + "ª marcha";
        System.out.println("Marcha reduzida para " + nomemarcha + "!");
    }

    public void virarEsquerda() {
        if (ligado) {
            if (velocidade <= 40 && velocidade > 0) {
                System.out.println("Virando para esquerda!");

            } else System.out.println("Reduza a velocidade!");

        } else System.out.println("Ligue o carro primeiro!");
    }

    public void virarDireita() {
        if (ligado) {
            if (velocidade <= 40 && velocidade > 0) {
                System.out.println("Virando para direita!");

            } else System.out.println("Reduza a velocidade!");

        } else System.out.println("Ligue o carro primeiro!");
    }
}
