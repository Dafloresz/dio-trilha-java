package Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        boolean control = true;

        while (control) {
            System.out.println("\n======== PAINEL DO CARRO ========");
            System.out.println("1 - Ligar o carro \n" +
                    "2 - Acelerar o carro \n" +
                    "3 - frear o carro \n" +
                    "4 - virar para a direita \n" +
                    "5 - virar para a esquerda \n" +
                    "6 - aumentar a marcha \n" +
                    "7 - reduzir a marcha \n" +
                    "8 - verificar velocidade \n" +
                    "9 - desligar o carro \n" +
                    "0 - Sair do programa ");

            System.out.print("Digite a opção: ");
            int aux = sc.nextInt();

            switch (aux) {
                case 1: carro.ligarCarro();
                    break;

                case 2: carro.acelerarCarro();
                    break;

                case 3: carro.freiarCarro();
                    break;

                case 4: carro.virarDireita();
                    break;

                case 5: carro.virarEsquerda();
                    break;

                case 6: carro.aumentarMarcha();
                    break;

                case 7: carro.reduzirMarcha();
                    break;
                case 8:
                    System.out.println("Velocidade atual: " + (int) carro.checarVelocidade() + "KM/H");
                    break;

                case 9: carro.desligarCarro();
                    break;

                case 0:  System.out.println("Encerrando Programa!");
                control = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
