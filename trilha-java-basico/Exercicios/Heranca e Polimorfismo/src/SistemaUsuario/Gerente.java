package SistemaUsuario;

public class Gerente extends Funcionario{
    public Gerente(String name, String email, String password, boolean adm) {
        super(name, email, password, true);
    }

    public void gerarRelatorio(){
        System.out.println("Gerando relatório financeiro!");
    }

    public void consultarVendas(){
        System.out.println("Consultando vendas!");
    }
}
