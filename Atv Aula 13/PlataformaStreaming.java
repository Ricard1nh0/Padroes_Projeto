// PlataformaStreaming.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlataformaStreaming implements ISubject {

    private Map<String, List<IObserver>> observadoresPorGenero = new HashMap<>();

    @Override
    public void inscrever(IObserver observer, String genero) {
        System.out.println("PLATAFORMA: Usuário '" + observer.getNome() + "' se inscreveu para o gênero '" + genero + "'.");
        
        this.observadoresPorGenero.computeIfAbsent(genero, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void desinscrever(IObserver observer, String genero) {
        System.out.println("PLATAFORMA: Usuário '" + observer.getNome() + "' cancelou a inscrição para o gênero '" + genero + "'.");
        
        if (this.observadoresPorGenero.containsKey(genero)) {
            this.observadoresPorGenero.get(genero).remove(observer);
        }
    }

    @Override
    public void notificar(String genero, String mensagem) {
        System.out.println("\nPLATAFORMA: Notificando usuários do gênero '" + genero + "'...");
        
        List<IObserver> observadores = this.observadoresPorGenero.get(genero);

        if (observadores == null || observadores.isEmpty()) {
            System.out.println("PLATAFORMA: Nenhum usuário inscrito em '" + genero + "'.");
            return;
        }

        for (IObserver observer : observadores) {
            observer.update(mensagem);
        }
    }

    // aciona a notificação
    public void adicionarConteudo(String titulo, String genero) {
        System.out.println("\n--- NOVO LANÇAMENTO NA PLATAFORMA ---");
        System.out.println("Título: " + titulo + ", Gênero: " + genero);
        
        String mensagem = String.format("Novo conteúdo de '%s' disponível: '%s'!", genero, titulo);
        this.notificar(genero, mensagem);
    }
}