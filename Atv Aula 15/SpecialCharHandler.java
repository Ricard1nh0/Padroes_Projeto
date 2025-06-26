public class SpecialCharHandler extends BaseValidationHandler {
    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se a senha possui um caractere especial [@#$%&*]...");
        if (!data.getPassword().matches(".*[@#$%&*].*")) {
            System.out.println("--> ERRO: A senha deve conter um dos seguintes caracteres especiais: @, #, $, %, &, *");
            return false;
        }
        System.out.println("--> OK: Possui caractere especial.");
        return checkNext(data);
    }
}