import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = Login.getInstancia();

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        String codigo = login.gerarCodigoVerificacao();
        System.out.println("Digite o código de verificação: " + codigo);
        String codigoDigitado = scanner.nextLine();
        
        if (login.verificarBot(codigo, codigoDigitado)) {
            if (login.autenticar(usuario, senha)) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Usuário ou senha incorretos.");
            }
        } else {
            System.out.println("Falha na verificação de bot.");
        }

        scanner.close();
    }
}
