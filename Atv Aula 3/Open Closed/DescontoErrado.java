public class DescontoErrado{

    private double valor;

    public DescontoErrado(double valor) {
        this.valor = valor;
    }

    public double calcularDesconto(String tipoDesconto){

        double valorDescontado = 0;

        if (tipoDesconto.equals("fixo")) {
            valorDescontado = valor - valor * 0.1;
        } else if (tipoDesconto.equals("fidelidade")) {
            valorDescontado = valor - valor * 0.2;
        }

        return valorDescontado;

    }

    /* Dessa forma esta incorreto pois sempre que for preciso adicionar
     * um novo tipo de desconto será necessário alterar o código
     */

}

