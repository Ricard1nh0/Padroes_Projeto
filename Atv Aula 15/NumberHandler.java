public class NumberHandler extends BaseValidationHandler {
    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha possui um número...");
        if (!data.getPassword().matches(".*[0-9].*")) {
            System.out.println("--> ERRO: A senha deve conter pelo menos um número.");
            return false;
        }
        System.out.println("--> OK: Possui número.");
        return checkNext(data);
    }
}