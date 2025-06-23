// Main.java
public class Main {
    public static void main(String[] args) {
        PlataformaStreaming plataforma = new PlataformaStreaming();

        IObserver cliente_ana = new Usuario("Ana");
        IObserver cliente_bruno = new Usuario("Bruno");
        IObserver cliente_carla = new Usuario("Carla");
        IObserver cliente_daniel = new Usuario("Daniel");
        IObserver cliente_elisa = new Usuario("Elisa"); // Não se inscreve em nada

        System.out.println("--- FASE DE INSCRIÇÕES ---");

        plataforma.inscrever(cliente_ana, "Ação");
        plataforma.inscrever(cliente_ana, "Ficção Científica");

        plataforma.inscrever(cliente_bruno, "Ação");
        plataforma.inscrever(cliente_bruno, "Anime");

        plataforma.inscrever(cliente_carla, "Comédia");

        plataforma.inscrever(cliente_daniel, "Terror");
        plataforma.inscrever(cliente_daniel, "Anime");

        
        plataforma.adicionarConteudo("O Agente Implacável", "Ação");
        
        plataforma.adicionarConteudo("Rindo à Toa 3", "Comédia");
        plataforma.adicionarConteudo("A Lenda do Dragão Dourado", "Anime");
        
        plataforma.adicionarConteudo("A Cabana Silenciosa", "Terror");
        
        plataforma.adicionarConteudo("Planeta Esquecido", "Ficção Científica");

        plataforma.adicionarConteudo("A Vida em Documento", "Documentário");

        System.out.println("\n--- MUDANÇA NAS INSCRIÇÕES ---");
        plataforma.desinscrever(cliente_daniel, "Anime");

        plataforma.adicionarConteudo("Ninja Cibernético", "Anime");
    }
}