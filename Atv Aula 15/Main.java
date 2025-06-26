public class Main {
    public static void main(String[] args) {

        BaseValidationHandler validationChain = new LoginExistsHandler();

        validationChain
            .setNext(new MinLengthHandler())
            .setNext(new MaxLengthHandler())
            .setNext(new UppercaseHandler())
            .setNext(new LowercaseHandler())
            .setNext(new NumberHandler())
            .setNext(new SpecialCharHandler())
            .setNext(new NoConsecutiveNumbersHandler()); 

        System.out.println("======================================================");
        System.out.println("Caso 1: Tentativa com senha CORRETA");
        LoginData successData = new LoginData("admin", "Senha@Forte1");
        boolean successResult = validationChain.handle(successData);
        System.out.println("\nResultado final: " + (successResult ? "Login e Senha VÁLIDOS!" : "Login ou Senha INVÁLIDOS."));
        System.out.println("======================================================\n");


        System.out.println("======================================================");
        System.out.println("Caso 2: Tentativa com login inexistente");
        LoginData wrongLoginData = new LoginData("usuario.fake", "Senha@Forte1");
        boolean wrongLoginResult = validationChain.handle(wrongLoginData);
        System.out.println("\nResultado final: " + (wrongLoginResult ? "Login e Senha VÁLIDOS!" : "Login ou Senha INVÁLIDOS."));
        System.out.println("======================================================\n");


        System.out.println("======================================================");
        System.out.println("Caso 3: Tentativa com senha com números sequenciais");
        LoginData seqNumData = new LoginData("joao.silva", "Senha#Ruim123");
        boolean seqNumResult = validationChain.handle(seqNumData);
        System.out.println("\nResultado final: " + (seqNumResult ? "Login e Senha VÁLIDOS!" : "Login ou Senha INVÁLIDOS."));
        System.out.println("======================================================\n");
        
        System.out.println("======================================================");
        System.out.println("Caso 4: Tentativa com senha sem caractere especial");
        LoginData noSpecialCharData = new LoginData("ana.clara", "SenhaFraca1");
        boolean noSpecialCharResult = validationChain.handle(noSpecialCharData);
        System.out.println("\nResultado final: " + (noSpecialCharResult ? "Login e Senha VÁLIDOS!" : "Login ou Senha INVÁLIDOS."));
        System.out.println("======================================================\n");
    }
}