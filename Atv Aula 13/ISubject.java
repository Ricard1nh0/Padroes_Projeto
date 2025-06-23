public interface ISubject {
    void inscrever(IObserver observer, String genero);
    void desinscrever(IObserver observer, String genero);
    void notificar(String genero, String mensagem);
}