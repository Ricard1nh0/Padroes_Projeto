//Exemplo Correto

class Produzir{

    private String protocolo;

    public Produzir(String protocolo) {
        this.protocolo = protocolo;
    }

    // Responsabilidade 1
    public void produzirProtocolo(){
        System.out.println("Protocolo " + protocolo + " produzido");
    }

    public String getProtocolo() {
        return protocolo;
    }
    
}

class Conferir{

    private String protocolo;
    private String selo;

    public Conferir(String protocolo, String selo){
        this.protocolo = protocolo;
        this.selo = selo;
    }

    // Responsabilidade 2
    public void conferirProtocolo(){
        System.out.println("protocolo " + protocolo + " conferido");
        System.out.println("selo" + selo + "gerado");
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getSelo() {
        return selo;
    }
            
}
    /* Dessa forma o principio da Responsabilidade unica é respeitado
     * pois atribui a Responsabilidade 1 a classe Produzir e a Responsabilidade 2
     * a classe Conferir
     */



