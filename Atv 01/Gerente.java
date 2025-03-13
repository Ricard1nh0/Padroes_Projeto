public class Gerente extends Funcionario implements Autenticavel, Fornecedor, Departamento{
    
    private String areaGerencia;

    public Gerente(String nome, String cpf, double salarioBase, String areaGerencia){
        super(nome, cpf, salarioBase);
        this.areaGerencia = areaGerencia;
    }

    @Override
    public void calcSalario(double salarioBase){
        System.out.println("salario calculado");
    }

    public void login(){
        System.out.println("realizar login");
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

    public String getAreaGerencia() {
        return areaGerencia;
    }

    public void setAreaGerencia(String areaGerencia) {
        this.areaGerencia = areaGerencia;
    }   
   
}
