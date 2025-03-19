//Exemplo Incorreto

package liskov;

public class ContaBancaria{

    private double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void sacar(double valor){
        if (valor <= saldo) {   
            saldo -= valor;
            System.out.println("Saque Realizado");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    }

class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    @Override
    public void sacar(double valor){
        if (valor > super.getSaldo()) {
            System.out.println("Valor maior que o Saldo");
        } else if (valor < 50) {
            System.out.println("Saque Minino de R$50,00");
        } else {
            super.sacar(valor);
            System.out.println("Saque Realizado");
        }
    }

    /*Dessa forma o principio não é respeitado pois a classe ContaPoupanca não pode
     * substituir a classe ContaBancaria pois a ContaPoupanca possui uma regra de negocio
     * diferente no método sacar
     */

}