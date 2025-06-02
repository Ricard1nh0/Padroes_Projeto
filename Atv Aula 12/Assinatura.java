import java.util.HashSet;
import java.util.Set;
import java.text.NumberFormat;
import java.util.Locale;

public class Assinatura {
    private static final double PRECO_BASE = 9.99;
    private static final String DESCRICAO_BASE = "Assinatura Base: Assistir vídeos num único dispositivo";
    private Set<PacoteOpcional> pacotesAdicionais;
    private NumberFormat formatadorMoeda;

    public Assinatura() {
        this.pacotesAdicionais = new HashSet<>(); // HashSet garante que não haverá pacotes repetidos
        this.formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    }

    public boolean adicionarPacote(PacoteOpcional pacote) {
        if (pacote == null) {
            // Esta verificação é mais para robustez interna, a UI deve prevenir nulos.
            System.out.println("Erro: Tentativa de adicionar um pacote nulo.");
            return false;
        }
        boolean adicionado = pacotesAdicionais.add(pacote);
        if (adicionado) {
            System.out.println("Pacote '" + pacote.getDescricao() + "' adicionado com sucesso!");
        } else {
            System.out.println("Pacote '" + pacote.getDescricao() + "' já incluído na sua assinatura.");
        }
        return adicionado;
    }

    public boolean removerPacote(PacoteOpcional pacote) {
        if (pacote == null) {
            System.out.println("Erro: Tentativa de remover um pacote nulo.");
            return false;
        }
        boolean removido = pacotesAdicionais.remove(pacote);
        if (removido) {
            System.out.println("Pacote '" + pacote.getDescricao() + "' removido com sucesso!");
        } else {
            System.out.println("Pacote '" + pacote.getDescricao() + "' não encontrado na sua assinatura para remoção.");
        }
        return removido;
    }

    public double calcularTotal() {
        double total = PRECO_BASE;
        for (PacoteOpcional pacote : pacotesAdicionais) {
            total += pacote.getPreco();
        }
        return total;
    }

    public String getDescricaoAssinatura() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("\n======= SUA ASSINATURA ATUAL =======\n");
        descricao.append(DESCRICAO_BASE).append(" - ").append(formatadorMoeda.format(PRECO_BASE)).append("\n");

        if (pacotesAdicionais.isEmpty()) {
            descricao.append("Nenhum pacote adicional selecionado.\n");
        } else {
            descricao.append("Pacotes Adicionais Inclusos:\n");
            for (PacoteOpcional pacote : pacotesAdicionais) {
                descricao.append("  - ").append(pacote.getDescricao()).append(" (").append(formatadorMoeda.format(pacote.getPreco())).append(")\n");
            }
        }
        descricao.append("------------------------------------\n");
        descricao.append("TOTAL DA ASSINATURA: ").append(formatadorMoeda.format(calcularTotal())).append("\n");
        descricao.append("====================================");
        return descricao.toString();
    }

    public Set<PacoteOpcional> getPacotesAdicionais() {
        return new HashSet<>(pacotesAdicionais); // Retorna uma cópia
    }
}
