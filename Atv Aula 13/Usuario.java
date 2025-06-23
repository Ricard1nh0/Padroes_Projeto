public class Usuario implements IObserver {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println("  -> Olá, " + this.nome + "! Você recebeu uma notificação: '" + mensagem + "'");
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}