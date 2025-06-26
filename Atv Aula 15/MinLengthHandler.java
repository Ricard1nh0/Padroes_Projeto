public class MinLengthHandler extends BaseValidationHandler {
    private static final int MIN_LENGTH = 8;

    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha tem pelo menos " + MIN_LENGTH + " caracteres...");
        if (data.getPassword().length() < MIN_LENGTH) {
            System.out.println("--> ERRO: A senha deve ter no mínimo " + MIN_LENGTH + " caracteres.");
            return false;
        }
        System.out.println("--> OK: Comprimento mínimo atendido.");
        return checkNext(data);
    }
}