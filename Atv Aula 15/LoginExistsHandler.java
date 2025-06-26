import java.util.Arrays;
import java.util.List;

public class LoginExistsHandler extends BaseValidationHandler {
    private final List<String> registeredLogins = Arrays.asList("admin", "joao.silva", "ana.clara");

    @Override
    public boolean handle(LoginData data) {
        System.out.println("Verificando se o login '" + data.getLogin() + "' existe...");
        if (!registeredLogins.contains(data.getLogin())) {
            System.out.println("--> ERRO: Login não cadastrado.");
            return false;
        }
        System.out.println("--> OK: Login existe.");
        return checkNext(data);
    }
}