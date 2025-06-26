public class NoConsecutiveNumbersHandler extends BaseValidationHandler {
    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha não possui 3 números sequenciais...");
        char[] passChars = data.getPassword().toCharArray();
        for (int i = 0; i < passChars.length - 2; i++) {
            char c1 = passChars[i];
            char c2 = passChars[i+1];
            char c3 = passChars[i+2];

            // Verifica se os três caracteres são dígitos
            if (Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3)) {
                // Verifica se são sequenciais (ex: '1'+1 = '2', '2'+1 = '3')
                if (c2 == c1 + 1 && c3 == c2 + 1) {
                    System.out.println("--> ERRO: A senha não pode conter 3 números sequenciais (como 123).");
                    return false;
                }
            }
        }
        System.out.println("--> OK: Não possui números sequenciais.");
        return checkNext(data);
    }
}