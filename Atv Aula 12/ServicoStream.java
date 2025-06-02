import java.util.HashSet;
import java.util.Set;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class ServicoStream {
    private static Scanner scanner = new Scanner(System.in);
    private static Assinatura assinatura = new Assinatura();

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao serviço de assinatura de Stream!");

        boolean executando = true;
        while (executando) {
            exibirMenuPrincipal();
            int escolha = lerOpcaoDoUsuario();

            switch (escolha) {
                case 1:
                    System.out.println(assinatura.getDescricaoAssinatura());
                    break;
                case 2:
                    adicionarPacoteInterativo();
                    break;
                case 3:
                    removerPacoteInterativo();
                    break;
                case 4:
                    listarPacotesDisponiveis();
                    break;
                case 0:
                    executando = false;
                    System.out.println("Obrigado por usar nosso serviço de assinatura! Volte sempre.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
            if (executando) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine(); // Consome a linha restante do input anterior
            }
        }
        scanner.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Ver minha assinatura atual");
        System.out.println("2. Adicionar pacote opcional");
        System.out.println("3. Remover pacote opcional");
        System.out.println("4. Listar todos os pacotes opcionais disponíveis");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcaoDoUsuario() {
        int opcao = -1;
        try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
        } finally {
            scanner.nextLine(); // Limpa o buffer do scanner
        }
        return opcao;
    }

    private static void listarPacotesDisponiveis() {
        System.out.println("\n--- PACOTES OPCIONAIS DISPONÍVEIS ---");
        PacoteOpcional[] todosPacotes = PacoteOpcional.values();
        if (todosPacotes.length == 0) {
            System.out.println("Nenhum pacote opcional disponível no momento.");
            return;
        }
        for (int i = 0; i < todosPacotes.length; i++) {
            System.out.println((i + 1) + ". " + todosPacotes[i].getDescricao() + " - " + PacoteOpcional.formatarMoeda(todosPacotes[i].getPreco()));
        }
    }

    private static void adicionarPacoteInterativo() {
        listarPacotesDisponiveis();
        PacoteOpcional[] todosPacotes = PacoteOpcional.values();

        if (todosPacotes.length == 0) {
            return; // Já tratado em listarPacotesDisponiveis
        }

        System.out.print("Digite o número do pacote que deseja adicionar (ou 0 para cancelar): ");
        int escolha = lerOpcaoDoUsuario();

        if (escolha > 0 && escolha <= todosPacotes.length) {
            PacoteOpcional pacoteEscolhido = todosPacotes[escolha - 1];
            assinatura.adicionarPacote(pacoteEscolhido);
        } else if (escolha == 0) {
            System.out.println("Adição de pacote cancelada.");
        } else {
            System.out.println("Número de pacote inválido.");
        }
    }

    private static void removerPacoteInterativo() {
        Set<PacoteOpcional> pacotesAtuaisSet = assinatura.getPacotesAdicionais();

        if (pacotesAtuaisSet.isEmpty()) {
            System.out.println("Você não possui pacotes adicionais para remover.");
            return;
        }

        // Converter Set para List para permitir seleção por índice
        List<PacoteOpcional> pacotesAtuaisList = new ArrayList<>(pacotesAtuaisSet);

        System.out.println("\n--- SEUS PACOTES ADICIONAIS ---");
        for (int i = 0; i < pacotesAtuaisList.size(); i++) {
            PacoteOpcional pacote = pacotesAtuaisList.get(i);
            System.out.println((i + 1) + ". " + pacote.getDescricao() + " - " + PacoteOpcional.formatarMoeda(pacote.getPreco()));
        }

        System.out.print("Digite o número do pacote que deseja remover (ou 0 para cancelar): ");
        int escolha = lerOpcaoDoUsuario();

        if (escolha > 0 && escolha <= pacotesAtuaisList.size()) {
            PacoteOpcional pacoteARemover = pacotesAtuaisList.get(escolha - 1);
            assinatura.removerPacote(pacoteARemover);
        } else if (escolha == 0) {
            System.out.println("Remoção de pacote cancelada.");
        } else {
            System.out.println("Número de pacote inválido.");
        }
    }
}