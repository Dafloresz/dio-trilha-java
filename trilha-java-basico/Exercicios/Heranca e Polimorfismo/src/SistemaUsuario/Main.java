package SistemaUsuario;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = null;
        boolean ajudador = true;

        while(ajudador){
            System.out.println("Selecione o funcionario para cadastro:");
            System.out.println("1  Gerente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Atendente");
            System.out.println("0 - Sair");

            System.out.println("Digite sua opção: ");
            int aux = sc.nextInt();
            sc.nextLine();


            if (aux == 0) {
                System.out.println("Encerrando sistema...");
                sc.close();
                return;
            }

            System.out.print("Digite o nome: ");
            String name = sc.nextLine();

            System.out.println("Digite a senha");
            String passaword = sc.nextLine();

            System.out.println("Digite o email");
            String email = sc.nextLine();


            switch (aux){
                case 1:
                    funcionario = new Gerente(name, passaword, email, true);
                    System.out.println("\n✔ Gerente cadastrado com sucesso!");
                    break;
                case 2:
                    funcionario = new Vendedor(name, email, passaword, false);
                    System.out.println("\n✔ Vendedor cadastrado com sucesso!");
                    break;
                case 3:
                    funcionario = new Atendente(name, email, passaword, false);
                    System.out.println("\nAtendente cadastrado com sucesso!");
                    break;
            }

            ajudador = false;
        }
        System.out.println("======= Tela de Login ========");
        System.out.print("Email: ");
        String emailLogin = sc.nextLine();
        System.out.print("Senha: ");
        String senhaLogin = sc.nextLine();
        funcionario.login(emailLogin, senhaLogin);

        boolean logado = true;

        while (logado) {
            System.out.println("Usuário: " + funcionario.getName() +
                    " | Administrador: " + (funcionario.isAdm() ? "Sim" : "Não"));
            System.out.println("──────────────────────────────");

            if (funcionario instanceof Gerente) {
                exibirMenuGerente();
            } else if (funcionario instanceof Vendedor) {
                exibirMenuVendedor();
            } else if (funcionario instanceof Atendente) {
                exibirMenuAtendente();
            }

            System.out.println("──────────────────────────────");
            System.out.println("7 - Alterar dados");
            System.out.println("8 - Alterar senha");
            System.out.println("9 - Logoff");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");

            int acao = sc.nextInt();
            sc.nextLine();

            if (funcionario instanceof Gerente) {
                Gerente g = (Gerente) funcionario;
                switch (acao) {
                    case 1: g.gerarRelatorio();  break;
                    case 2: g.consultarVendas(); break;
                }
            } else if (funcionario instanceof Vendedor) {
                Vendedor v = (Vendedor) funcionario;
                switch (acao) {
                    case 1: v.realizarVendas();   break;
                    case 2: v.consultarVendas(); break;
                }
            } else if (funcionario instanceof Atendente) {
                Atendente a = (Atendente) funcionario;
                switch (acao) {
                    case 1:
                        System.out.print("Valor recebido: R$ ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        a.receberPagamento(valor);
                        break;
                    case 2: a.fecharCaixa(); break;
                }
            }

            switch (acao) {
                case 7:
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = sc.nextLine();
                    funcionario.alterarDados(novoNome, novoEmail);
                    break;
                case 8:
                    System.out.print("Senha atual: ");
                    String senhaAtual = sc.nextLine();
                    System.out.print("Nova senha: ");
                    String novaSenha = sc.nextLine();
                    funcionario.alterarSenha(senhaAtual, novaSenha);
                    break;
                case 9:
                    funcionario.logoff();
                    logado = false;
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    return;
                default:
                    if (acao < 1 || acao > 2) {
                        System.out.println("Opção inválida!");
                    }
            }
        }

        sc.close();
    }

    static void exibirMenuGerente() {
        System.out.println("1 - Gerar relatório financeiro");
        System.out.println("2 - Consultar vendas");
    }

    static void exibirMenuVendedor() {
        System.out.println("1 - Realizar venda");
        System.out.println("2 - Consultar minhas vendas");
    }

    static void exibirMenuAtendente() {
        System.out.println("1 - Receber pagamento");
        System.out.println("2 - Fechar caixa");

    }

}
