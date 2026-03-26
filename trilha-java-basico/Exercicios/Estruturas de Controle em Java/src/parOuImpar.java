import java.util.Scanner;

public class parOuImpar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean aux = true;
        int num1 = 0;
        int num2 = 0;

        while (aux) {
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            num2 = sc.nextInt();

            if (num2 < num1) {
                System.out.println("O segundo número tem que ser maior que o primeiro!");
            } else aux = false;
        }

        sc.nextLine();
        System.out.print("Selecione par ou ímpar: ");
        String escolhaUsuario = sc.nextLine();

        for (int i = num2; i > num1; i--) {
            if (escolhaUsuario.matches("par")) {
                if (i%2 == 0){
                    System.out.println(i);
                }
            }

            if (escolhaUsuario.matches("impar")){
                if (!(i%2 == 0)){
                    System.out.println(i);
                }
            }

        }
    }
}
