import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroDois <= parametroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        for (int i = 1; parametroUm < parametroDois ; i++) {
            System.out.println("Imprimindo o número: " + i);
            parametroUm++;
        }
    }
}