package Bilheteria;

public class IngressoFamilia extends Ingresso {
    private int quantidadePessoas;


    public IngressoFamilia(double valor, String nomeFilme, String legenda, int quantidadePessoas) {
        super(valor, nomeFilme, legenda);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getValor() {
        double total = super.getValor() * quantidadePessoas;

        if (quantidadePessoas > 3){
            total = total - (total * 0.05);
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ingresso Familia: " +
                "quantidade de pessoas: " + quantidadePessoas + super.toString() + " ";
    }
}
