import java.util.InputMismatchException;
import java.util.Scanner;

public class LojaQuadrinhosApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaAssinatura caixa = new CaixaAssinatura();

        System.out.println("Bem-vindo à Loja de Quadrinhos - Assinaturas!");

        NivelCliente nivelEscolhido = null;
        while (nivelEscolhido == null) {
            System.out.println("\nEscolha o seu nível de cliente:");
            System.out.println("1. BRONZE (" + NivelCliente.BRONZE.getQuantidadeItens() + " itens)");
            System.out.println("2. PRATA (" + NivelCliente.PRATA.getQuantidadeItens() + " itens)");
            System.out.println("3. OURO (" + NivelCliente.OURO.getQuantidadeItens() + " itens)");
            System.out.println("4. PLATINA (" + NivelCliente.PLATINA.getQuantidadeItens() + " itens)");
            System.out.print("Digite o número do nível desejado: ");

            try {
                int επιλογή = scanner.nextInt(); // επιλογή = escolha em grego, para evitar conflito com 'opcao'
                switch ( επιλογή ) {
                    case 1:
                        nivelEscolhido = NivelCliente.BRONZE;
                        break;
                    case 2:
                        nivelEscolhido = NivelCliente.PRATA;
                        break;
                    case 3:
                        nivelEscolhido = NivelCliente.OURO;
                        break;
                    case 4:
                        nivelEscolhido = NivelCliente.PLATINA;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        System.out.println("\nGerando sua caixa para o nível: " + nivelEscolhido + "...");
        caixa.gerarCaixa(nivelEscolhido);
        caixa.exibirDetalhesCaixa();

        scanner.close();
        System.out.println("\nObrigado por usar nosso sistema de assinatura!");
    }
}