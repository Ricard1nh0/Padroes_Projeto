//Exemplo Correto

class Impressora {
    public void imprimirNota(String conteudo) {
        System.out.println("Imprimindo nota fiscal: ");
    }
}

class GeradorPDF {
    public void gerarNota(String conteudo) {
        System.out.println("Gerando PDF da nota fiscal: ");
    }
}

class Pedido {
    private Object metodoSaida;

    public Pedido(Object metodoSaida) {
        this.metodoSaida = metodoSaida;
    }

    public void finalizarPedido() {
        System.out.println("Pedido finalizado.");

        if (metodoSaida instanceof Impressora) {
            ((Impressora) metodoSaida).imprimirNota("Nota Fiscal do Pedido #1234");
        } else if (metodoSaida instanceof GeradorPDF) {
            ((GeradorPDF) metodoSaida).gerarNota("Nota Fiscal do Pedido #1234");
        }
    }
}

/*Segue o principio pois a dependencia passa pelo construtor como um parametro*/
