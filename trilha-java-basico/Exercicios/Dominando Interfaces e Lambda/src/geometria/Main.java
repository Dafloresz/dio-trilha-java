package geometria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        FormaGeometrica formaGeometrica = null;
        System.out.println("Qual forma geometrica você deseja calcular a área?");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Círculo");

        System.out.print("Escolha: ");
        int aux = sc.nextInt();

        if (aux == 1){
            System.out.print("Qual o lado do quadrado: ");
            double lado = sc.nextDouble();

            formaGeometrica = new Quadrado(lado);

        } else if (aux == 2) {
            System.out.print("Qual o tamanho da base: ");
            double base = sc.nextDouble();
            System.out.print("Qual o tamanho da Altura: ");
            double altura = sc.nextDouble();

            formaGeometrica = new Retangulo(base, altura);
        } else if (aux == 3) {
            System.out.println("Qual o valor do RAIO: ");
            double raio = sc.nextDouble();

            formaGeometrica = new Circulo(raio);

        } else System.out.println("Opção inválida!");


        System.out.println("Área do " + formaGeometrica.toString() + String.format("%.2f", formaGeometrica.calcularArea()));
    }
}
