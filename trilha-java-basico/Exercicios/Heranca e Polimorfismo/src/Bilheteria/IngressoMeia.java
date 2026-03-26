package Bilheteria;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(double valor, String nomeFilme, String legenda) {
        super(valor, nomeFilme, legenda);
    }

    @Override
    public double getValor() {
        return super.getValor() * 0.5;
    }

    @Override
    public String toString() {
        return "Ingresso Meia: " + super.toString();
    }
}
