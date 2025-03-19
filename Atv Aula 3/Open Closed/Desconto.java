public abstract class Desconto {
    
    public abstract double aplicarDesconto(double valor);

}

class DescontoFixo extends Desconto{

    @Override
    public double aplicarDesconto(double valor){
        
        double valorDescontado;

        return valorDescontado = valor - valor * 0.1;
    }

}

class DescontoFidelidade extends Desconto{

    @Override
    public double aplicarDesconto(double valor){
        
        double valorDescontado;

        return valorDescontado = valor - valor * 0.2;
    }

    /* Dessa Forma o principio é respeitado pois sempre que se precisar adicionar um novo tipo de desconto
    * não será necessário modificar nenhuma classem ou método, apenas implementar uma nova classe
    */
}