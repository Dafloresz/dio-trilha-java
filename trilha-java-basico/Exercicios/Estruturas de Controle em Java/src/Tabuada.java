import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + (i *num));
        }
    }
}
