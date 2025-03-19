// Exemplo Incorreto

class ImpressoraComum implements Impressora {
 
    @Override
    public void imprimirDocumento(){
        System.out.println("Documento impresso");
    }

    @Override
    public void enviarFax(){}

    @Override
    public void digitalizar(){}

}

class ImpressoraComFax implements Impressora {

    @Override
    public void imprimirDocumento(){
        System.out.println("Documento impresso");
    }

    @Override
    public void enviarFax(){
        System.out.println("Fax Enviado");
    }

    @Override
    public void digitalizar(){}    
}


interface Impressora {
    
    public void imprimirDocumento();

    public void enviarFax();

    public void digitalizar();
}

/* Nesse exemplo está incorreto pois uma interface tem varias implementações
 * em classes diferentes e algumas delas se tornam desnecessárias
 */