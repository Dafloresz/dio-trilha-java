package Bilheteria;

public class Ingresso {
    private double valor;
    private String nomeFilme;
    private String legenda;

    public Ingresso(double valor, String nomeFilme, String legenda) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.legenda = legenda;
    }

    public double getValor(){
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getLegenda() {
        return legenda;
    }


    @Override
    public String toString() {
        return "Filme: " + nomeFilme +
                " | " + legenda +
                " | Valor: R$ " + String.format("%.2f", getValor());
    }
}
