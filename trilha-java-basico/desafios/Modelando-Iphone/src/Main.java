import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== MENU iPHONE =====");
            System.out.println("--- Reprodutor Musical ---");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Pausar música");
            System.out.println("3 - Selecionar música");
            System.out.println("--- Aparelho Telefônico ---");
            System.out.println("4 - Ligar para número");
            System.out.println("5 - Atender ligação");
            System.out.println("6 - Recusar ligação");
            System.out.println("7 - Iniciar correio de voz");
            System.out.println("8 - Adicionar contato");
            System.out.println("9 - Remover contato");
            System.out.println("10 - Enviar e-mail para contato");
            System.out.println("--- Navegador Internet ---");
            System.out.println("11 - Exibir página");
            System.out.println("12 - Adicionar nova aba");
            System.out.println("13 - Atualizar página");
            System.out.println("--- Câmera ---");
            System.out.println("14 - Tirar foto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da música: ");
                    String musica1 = scanner.nextLine();
                    iphone.tocar(musica1);
                    break;
                case 2:
                    iphone.pausar();
                    break;
                case 3:
                    System.out.print("Nome da música: ");
                    String musica2 = scanner.nextLine();
                    iphone.selecionarMusica(musica2);
                    break;
                case 4:
                    System.out.print("Número para ligar: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                    break;
                case 5:
                    iphone.atender();
                    break;
                case 6:
                    iphone.recusarLigacao();
                    break;
                case 7:
                    iphone.iniciarCorreioDeVoz();
                    break;
                case 8:
                    System.out.print("Nome do contato: ");
                    String novoContato = scanner.nextLine();
                    iphone.adicionarContato(novoContato);
                    break;
                case 9:
                    System.out.print("Nome do contato a remover: ");
                    String removeContato = scanner.nextLine();
                    iphone.removerContato(removeContato);
                    break;
                case 10:
                    System.out.print("Mensagem: ");
                    String mensagem = scanner.nextLine();
                    System.out.print("Contato destinatário: ");
                    String destinatario = scanner.nextLine();
                    iphone.enviarEmailContato(mensagem, destinatario);
                    break;
                case 11:
                    System.out.print("URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 12:
                    iphone.adicionarNovaAba();
                    break;
                case 13:
                    iphone.atualizarPagina();
                    break;
                case 14:
                    iphone.tirarFoto();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
