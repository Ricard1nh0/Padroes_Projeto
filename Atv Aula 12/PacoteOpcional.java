import java.text.NumberFormat;
import java.util.Locale;

// Enum para representar os pacotes opcionais com nome e preço
enum PacoteOpcional {
    PACOTE1("Assistir vídeos em vários dispositivos", 19.99),
    PACOTE2("Frete Grátis em produtos", 9.99),
    PACOTE3("Caixa surpresa com produtos relacionados a filmes e séries", 29.99),
    PACOTE4("Cartão de crédito Platinum", 49.99),
    PACOTE5("Compra com Cash Back", 19.99);

    private final String descricao;
    private final double preco;

    PacoteOpcional(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public static String formatarMoeda(double valor) {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor);
    }

    @Override
    public String toString() {
        return descricao + " - " + formatarMoeda(preco);
    }
}