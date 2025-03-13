public class Secretario extends Funcionario{

    private boolean status;

    public Secretario(String nome, String cpf, double salarioBase, boolean status){
        super(nome, cpf, salarioBase);
        this.status = status;
    }

    @Override
    public void calcSalario(double salarioBase){
        
        System.out.println("salario calculado");
    }

    @Override
    public void comissao(){}

    //Getter e setters

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

}
