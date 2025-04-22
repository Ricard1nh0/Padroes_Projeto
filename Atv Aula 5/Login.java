import java.util.Random;

class Login {
    private static Login instancia; //Guarda a instancia
    private String usuario = "admin";
    private String senha = "1234";

    private Login() {}

    //verificador de instancia ja criada
    public static Login getInstancia() {
        if (instancia == null) {
            instancia = new Login();
        }
        return instancia;
    }

    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    public String gerarCodigoVerificacao() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }
        return codigo.toString();
    }

    public boolean verificarBot(String codigoGerado, String entradaUsuario) {
        return codigoGerado.equals(entradaUsuario);
    }
}