package ProdutosTributados;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = null;

        while (true){
            System.out.println("Qual produto deseja calcular o tributo: ");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e Bem estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");

            System.out.print("Digite a opção: ");
            int aux = sc.nextInt();

            System.out.print("Qual o preço do produto: ");
            double precoProduto = sc.nextDouble();



            if (aux == 1){
                p = new Alimentacao();

            } else if (aux == 2) {
                p = new SaudeBemEstar();

            } else if (aux == 3){
                p = new Vestuario();

            } else if (aux == 4){
                p = new Cultura();
            } else System.out.println("Opção Inválida!");

            System.out.println("Valor do produto com o tributo calculado: " + String.format("%.2f", p.calculaTributo(precoProduto)));
            System.out.println("");
        }

    }
}
