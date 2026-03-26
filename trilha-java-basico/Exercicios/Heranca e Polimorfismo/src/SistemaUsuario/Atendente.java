package SistemaUsuario;

public class Atendente extends Funcionario {
    private double  valorEmCaixa;

    public Atendente(String name, String email, String password, boolean adm) {
        super(name, email, password, false);
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double amount){
        valorEmCaixa = valorEmCaixa + amount;
        System.out.println("Pagamento de R$ " + amount + " recebido. Caixa: R$ " + valorEmCaixa);
    }

    public void fecharCaixa(){
        System.out.println("Fechando caixa!");
    }
}
