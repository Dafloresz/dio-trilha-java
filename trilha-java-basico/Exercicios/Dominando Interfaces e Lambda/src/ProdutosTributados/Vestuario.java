package ProdutosTributados;

public class Vestuario implements Produto{
    private static final double tax = 0.025;

    @Override
    public double calculaTributo(double preco) {
        return preco + (preco * tax);
    }
}
