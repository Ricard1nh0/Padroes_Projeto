public class MaxLengthHandler extends BaseValidationHandler {
    private static final int MAX_LENGTH = 16;

    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha tem no máximo " + MAX_LENGTH + " caracteres...");
        if (data.getPassword().length() > MAX_LENGTH) {
            System.out.println("--> ERRO: A senha deve ter no máximo " + MAX_LENGTH + " caracteres.");
            return false;
        }
        System.out.println("--> OK: Comprimento máximo atendido.");
        return checkNext(data);
    }
}