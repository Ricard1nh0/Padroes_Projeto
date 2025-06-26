public class UppercaseHandler extends BaseValidationHandler {
    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha possui caractere maiúsculo...");
        if (!data.getPassword().matches(".*[A-Z].*")) {
            System.out.println("--> ERRO: A senha deve conter pelo menos um caractere maiúsculo.");
            return false;
        }
        System.out.println("--> OK: Possui caractere maiúsculo.");
        return checkNext(data);
    }
}