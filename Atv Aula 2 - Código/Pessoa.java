import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private Date dtNascimento;
    private int idade;
    private String rg;

    public Pessoa(String nome, String cpf, Date dtNascimento, int idade, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.idade = idade;
        this.rg = rg;
    }
    
    public abstract void exibirDados();
    public abstract String tipoPessoa();

    public void alterarNome(String nomeNovo){
        this.nome = nomeNovo;
    }

    public boolean verificarMaioridade(){
        return idade >= 18;
    }

    public void exibirIdentificacao() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf);
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    

}
