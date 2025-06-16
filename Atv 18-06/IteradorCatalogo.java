public class IteradorCatalogo implements Iterador {
    private CatalogoLivros catalogo;
    private int posicao = 0;

    public IteradorCatalogo(CatalogoLivros catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public boolean hasNext() {
        if (posicao < catalogo.getLivros().size() && catalogo.getLivros().get(posicao) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Livro livro = catalogo.getLivros().get(posicao);
        posicao++;
        return livro;
    }
}