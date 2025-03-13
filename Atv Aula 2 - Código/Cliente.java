import java.util.Date;

public class Cliente extends Pessoa implements Autenticavel{
    
    private String telefoneCliente;

    public Cliente(String nome, String cpf, Date dtNascimento, int idade, String rg, String telefone){
        super(nome, cpf, dtNascimento, idade, rg);
        this.telefoneCliente = telefone;
    }

    public void login(){
        System.out.println("Login Realizado");
    }

    @Override
    public String tipoPessoa() {
        return "Cliente";
    }

    @Override
    public void exibirDados() {
        System.out.println("Cliente: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Data de Nascimento: " + super.getDtNascimento());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("RG: " + super.getRg());
        System.out.println("Telefone: " + getTelefone());
    }

    public String getTelefone() {
        return telefoneCliente;
    }

    public void setTelefone(String telefone) {
        this.telefoneCliente = telefone;
    }
 
}
