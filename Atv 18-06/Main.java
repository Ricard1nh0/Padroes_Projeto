public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        catalogo.adicionarLivro(new Livro("1984", "George Orwell"));
        catalogo.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes"));
        catalogo.adicionarLivro(new Livro("A Arte da Guerra", "Sun Tzu"));

        System.out.println("Bem-vindo à Biblioteca! Listando todos os livros do catálogo:\n");

        Iterador iterador = catalogo.criarIterador();

        while (iterador.hasNext()) {
            Livro livro = (Livro) iterador.next();
            System.out.println(livro);
        }
    }
}