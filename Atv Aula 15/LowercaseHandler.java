public class LowercaseHandler extends BaseValidationHandler {
    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha possui caractere minúsculo...");
        if (!data.getPassword().matches(".*[a-z].*")) {
            System.out.println("--> ERRO: A senha deve conter pelo menos um caractere minúsculo.");
            return false;
        }
        System.out.println("--> OK: Possui caractere minúsculo.");
        return checkNext(data);
    }
}