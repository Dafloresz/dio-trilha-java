package SistemaUsuario;

public class Vendedor extends Funcionario {
    private int quantidadeVendas;

    public Vendedor(String name, String email, String password, boolean adm) {
        super(name, email, password, false);
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }


    public void realizarVendas(){
        quantidadeVendas = quantidadeVendas + 1;
        System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas(){
        System.out.println(getName() + " realizou " + quantidadeVendas + " venda(s).");
    }

}
