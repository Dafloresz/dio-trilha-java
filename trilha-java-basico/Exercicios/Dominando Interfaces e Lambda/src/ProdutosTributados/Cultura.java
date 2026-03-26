package ProdutosTributados;

public class Cultura implements Produto{
    private static final double tax = 0.04;

    @Override
    public double calculaTributo(double preco) {
        return preco + (preco * tax);
    }
}
