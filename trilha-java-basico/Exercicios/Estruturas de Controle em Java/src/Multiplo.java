import java.util.Scanner;

public class Multiplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numInicial = sc.nextInt();
        boolean aux = true;

        do {
            System.out.print("Digite outro número: ");
            int num = sc.nextInt();

            if(num < numInicial) {
                System.out.println("Segundo número tem que ser maior que o número inicial!");
                continue;
            }

            if (num % numInicial != 0){
                System.out.println("Não é múltiplo!");
                aux = false;

            }else {
                System.out.println("É múltiplo!");
            }
        } while (aux);
    }
}
