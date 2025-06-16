import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros implements Agregado {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorCatalogo(this);
    }
}