//Exemplo correto

class Impressora implements ImpressoraComum {
    
    @Override
    public void imprimirDocumento(String documento){
        System.out.println("Documento Impresso");
    }

}

class ImpressoraComFax implements ImpressoraComum, ImpressoraFax{

    @Override
    public void imprimirDocumento(String documento){
        System.out.println("Documento Impresso");
    }

    @Override
    public void enviarFax(){
        System.out.println("Fax enviado");
    }

}

interface ImpressoraFax{
    public void enviarFax();
}

interface ImpressoraComum{
    public void imprimirDocumento(String documento);
}

/*Aqui o principio é respeitado pois cada classe implementa somente a interface
 * que lhe é necessária, evitando a implementação de métodos que não são da competência 
 * da classe
 */