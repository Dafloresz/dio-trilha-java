package ProdutosTributados;

public class Alimentacao implements Produto{
    private static final double tax = 0.01;

    @Override
    public double calculaTributo(double preco) {
        return preco + (preco * tax);
    }
}
