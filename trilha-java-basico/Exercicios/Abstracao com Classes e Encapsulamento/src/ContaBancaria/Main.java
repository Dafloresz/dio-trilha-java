package ContaBancaria;

public class Main {
    static void main(String[] args) {
        ContaBancaria usuario = new ContaBancaria(0);
        System.out.println(usuario);

        usuario.depositar(700);

        System.out.println(usuario);

        usuario.pagarBoleto(230);

        System.out.println(usuario);

    }
}
