public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para representar o item como texto (útil para exibição)
     @Override
    public String toString() {
        return String.format("%s (R$ %.2f)", nome, preco);
    }

    // Método para obter o nome do item
    public String getNome() {
        return nome;
    }

    // Método para obter o preço do item
    public double getPreco() {
        return preco;
    }
}