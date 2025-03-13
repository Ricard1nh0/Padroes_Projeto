public class Diretor extends Funcionario implements Autenticavel, Departamento, Fornecedor{
    
    private String formacao;

    public Diretor(String nome, String cpf, double salarioBase, String formacao){
        super(nome, cpf, salarioBase);
        this.formacao = formacao;
    }

    @Override
    public void calcSalario(double salarioBase){
        System.out.println("salario calculado");
    }

    public void login(){
        System.out.println("realizar login");
    }

    public void cadastrarMetas(){
        System.out.println("Metas cadastradas");
    }

    public void realizarPedido(){
        System.out.println("Pedido Realizado");
    }

    public void criaDepartamento(){
        System.out.println("Departamento Criado");
    }

    public void cadastraFuncionario(){
        System.out.println("Cadastra Funcionario");
    }

    @Override
    public void comissao(){}


    public String formacao() {
        return formacao;
    }


    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }    

}
