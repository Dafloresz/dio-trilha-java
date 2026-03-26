package Bilheteria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ingresso ingresso;

        System.out.print("Qual o nome do filme? ");
        String nomeFilme = sc.nextLine();

        System.out.print("Dublado ou Legendado? ");
        String legenda = sc.nextLine();

        System.out.println("Valor base do ingresso: R$ 80,00");
        System.out.println("Qual ingresso você deseja?");
        System.out.println("1 - Ingresso Normal");
        System.out.println("2 - Ingresso Família");
        System.out.println("3 - Meia Entrada");
        System.out.print("Digite a opção: ");

        int aux = sc.nextInt();

        if (aux == 1) {
            ingresso = new Ingresso(80, nomeFilme, legenda);

        } else if (aux == 2) {
            System.out.println("Para quantas pessoas? ");
            int quant = sc.nextInt();
            ingresso = new IngressoFamilia(80, nomeFilme, legenda, quant);

        } else if (aux == 3) {
            ingresso = new IngressoMeia(80, nomeFilme, legenda);

        } else {
            System.out.println("Opção Inválida!");
            ingresso = null;
        }

        System.out.println(ingresso);
    }
}
