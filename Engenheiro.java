public class Engenheiro extends Funcionario implements Fornecedor{

    private String crea;
    private int nivel;

    public Engenheiro(String nome, String cpf, double salarioBase, String crea, int nivel){
        super(nome, cpf, salarioBase);
        this.crea = crea;
        this.nivel = nivel;
    }

    @Override
    public void calcSalario(double salarioBase){

        System.out.println("Salario Calculado");

    }

    @Override
    public void comissao(){

        System.out.println("Comissão adicionada ao Salario");
        
    }

    public void realizarPedido(){
        System.out.println("Pedido Realizado");
    }

    //Getters e Setters 
    public String getCrea() {
        return crea;
    }   

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
