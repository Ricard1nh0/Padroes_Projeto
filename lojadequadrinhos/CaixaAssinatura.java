// Arquivo: CaixaAssinatura.java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CaixaAssinatura {
    private List<Item> itensNaCaixa;
    private double valorTotal;
    private static final List<Item> ITENS_DISPONIVEIS = new ArrayList<>();
    private static final Random GERADOR_ALEATORIO = new Random();

    // Bloco estático para inicializar a lista de itens disponíveis uma única vez
    static {
        ITENS_DISPONIVEIS.add(new Item("Quadrinho", 15.00));
        ITENS_DISPONIVEIS.add(new Item("Chaveiro", 5.00));
        ITENS_DISPONIVEIS.add(new Item("Busto", 10.00));
        ITENS_DISPONIVEIS.add(new Item("Adesivo", 1.00));
        ITENS_DISPONIVEIS.add(new Item("Poster", 25.00));
        ITENS_DISPONIVEIS.add(new Item("Camiseta", 25.00));
        ITENS_DISPONIVEIS.add(new Item("Caneta", 3.00));
        ITENS_DISPONIVEIS.add(new Item("Miniatura", 20.00));
    }

    public CaixaAssinatura() {
        this.itensNaCaixa = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    // Método para gerar os itens da caixa de acordo com o nível do cliente
    public void gerarCaixa(NivelCliente nivel) {
        this.itensNaCaixa.clear(); // Limpa a caixa caso já tenha sido usada
        this.valorTotal = 0.0;    // Reseta o valor total

        int quantidadeDeItensParaAdicionar = nivel.getQuantidadeItens();

        if (ITENS_DISPONIVEIS.isEmpty()) {
            System.out.println("Nenhum item disponível para adicionar à caixa.");
            return;
        }

        for (int i = 0; i < quantidadeDeItensParaAdicionar; i++) {
            // Escolhe um item aleatório da lista de itens disponíveis
            int indiceAleatorio = GERADOR_ALEATORIO.nextInt(ITENS_DISPONIVEIS.size());
            Item itemSorteado = ITENS_DISPONIVEIS.get(indiceAleatorio);

            this.itensNaCaixa.add(itemSorteado);
            this.valorTotal += itemSorteado.getPreco();
        }
    }

    // Método para exibir os detalhes da caixa
    public void exibirDetalhesCaixa() {
        if (itensNaCaixa.isEmpty()) {
            System.out.println("A caixa está vazia.");
            return;
        }

        System.out.println("\n--- Itens na sua Caixa de Assinatura ---");
        for (Item item : itensNaCaixa) {
            System.out.println("- " + item.toString());
        }
        System.out.println("-----------------------------------------");
        System.out.printf("Valor total da caixa: R$ %.2f\n", valorTotal);
        System.out.println("-----------------------------------------");
    }
}