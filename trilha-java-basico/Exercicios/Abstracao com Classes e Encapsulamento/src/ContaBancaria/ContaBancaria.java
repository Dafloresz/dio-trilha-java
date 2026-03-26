package ContaBancaria;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;

        if (saldo <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = saldo * 0.5;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if(saldo < 0){
            double taxa = Math.abs(saldo) * 0.2;
            saldo = saldo - taxa;
        }

        saldo = saldo + quantia;
    }

    public void sacar(double quantia) {
        double limiteTotal = saldo + chequeEspecial;

        if (saldo > 0 && limiteTotal > quantia) {
            saldo = saldo - quantia;

        } else {
            System.out.println("Saldo insuficiente. Limite disponível: R$" + limiteTotal);
        }

    }

    public void pagarBoleto(double precoBoleto) {
        double limiteTotal = saldo + chequeEspecial;

        if (saldo > 0 && limiteTotal > precoBoleto) {
            saldo = saldo - precoBoleto;

        } else {
            System.out.println("Saldo insuficiente. Limite disponível: R$" + limiteTotal);
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public boolean verificarCheque() {
        return saldo < 0;
    }

    public void usarChequeEspecial(double quantiaUsada) {
        if (this.saldo > 0) {
            saldo = saldo - (quantiaUsada * 0.2);
        }
    }

    @Override
    public String toString() {
        return "Conta Bancaria: " +
                "saldo = " + saldo +
                ", chequeEspecial = " + chequeEspecial;
    }
}
