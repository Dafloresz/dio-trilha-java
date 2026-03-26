package ProdutosTributados;

public class SaudeBemEstar implements Produto{
    private static final double tax = 0.015;

    @Override
    public double calculaTributo(double preco) {
        return preco + (preco * tax);
    }
}
