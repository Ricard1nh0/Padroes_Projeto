//Exemplo Incorreto

class Impressora {

    public void imprimirNota(String conteudo) {
        System.out.println("Imprimindo nota fiscal: " + conteudo);
    }
}

class Pedido {

    private Impressora impressora;

    public Pedido() {
        this.impressora = new Impressora(); 
    }

    public void finalizarPedido() {
        System.out.println("Pedido finalizado.");
        impressora.imprimirNota("Nota Fiscal do Pedido #1234");
    }
}

/*Esta incorreto pois força a classe Pedido depender diretamente de Impressora */