// Exemplo  Incorreto

public class Registrador {

    private String protocolo;
    private String selo;

    public Registrador(String protocolo, String selo){
        this.protocolo = protocolo;
        this.selo = selo;
    }

    // Responsabilidade 1 = produzir o protocolo
    public void produzirProtocolo(){
        System.out.println("protocolo" + protocolo + "produzido");
    }

    // Responsabilidade 2 = conferir o protocolo
    public void conferirProtocolo(){
        System.out.println("protocolo" + protocolo + "conferido");
        System.out.println("selo " + selo + "gerado");
    }

    /* Viola o principio de responsabilidade unica por
     * atribuir a mesma classe duas responsabilidades
     * sendo elas: produzir e conferir
     */

    public String getProtocolo() {
        return protocolo;
    }

    public String getSelo() {
        return selo;
    }

}