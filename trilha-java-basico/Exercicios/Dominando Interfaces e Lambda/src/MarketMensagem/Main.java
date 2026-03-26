package MarketMensagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaEscolha = new ArrayList<>();
        Dispositivo dispositivo = null;

        System.out.println("Qual mensagem deseja enviar ?");
        String mensagem = sc.nextLine();

        boolean continua = true;
        while (continua) {
            System.out.println("Qual Dispositivo?");
            System.out.println("1 - Email");
            System.out.println("2 - SMS");
            System.out.println("3 - WhatsApp");
            System.out.println("4 - Rede Social");
            int escolhaUsuario = sc.nextInt();
            sc.nextLine();

            listaEscolha.add(escolhaUsuario);

            System.out.println("Deseja outro dispositivo? (sim/não)");
            String aux = sc.nextLine();

            if (aux.equals("não") || aux.equals("n")) {
                continua = false;
            }
        }

        for (Integer i : listaEscolha) {
            if (i.equals(1)){
                dispositivo = new Email();

            } else if (i.equals(2)) {
                dispositivo = new SMS();

            } else if (i.equals(3)) {
                dispositivo = new WhatsApp();

            } else if (i.equals(4)){
                dispositivo = new RedeSocial();
            }

            System.out.println(dispositivo.enviarMensagem(mensagem));
            System.out.println("");
        }

    }
}
