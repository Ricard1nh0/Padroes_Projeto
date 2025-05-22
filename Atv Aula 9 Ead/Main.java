// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Criar uma instância da biblioteca legada
        OldVehicleStorage legacyStorage = new OldVehicleStorage();

        // Criar uma instância do Adapter, passando a biblioteca legada
        IVehicleStorage adapter = new VehicleStorageAdapter(legacyStorage);

        // Criar um objeto Vehicle para ser salvo
        Vehicle car = new Vehicle("V001", "Fiat Mobi", 2023);

        System.out.println("Cliente: Solicitando o armazenamento do veículo através da nova interface...");
        adapter.saveVehicleData(car);

        System.out.println("\n--- Outro exemplo ---");
        Vehicle truck = new Vehicle("T777", "Volvo FH", 2022);
        adapter.saveVehicleData(truck);
    }
}