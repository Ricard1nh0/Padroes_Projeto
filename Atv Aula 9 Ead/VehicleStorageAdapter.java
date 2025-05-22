public class VehicleStorageAdapter implements IVehicleStorage {

    private OldVehicleStorage oldStorage; // Referência à biblioteca legada

    // recebe uma instância da biblioteca legada
    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        // Converter o objeto Vehicle para String
        String vehicleDataAsString = convertVehicleToString(vehicle);

        // 2. Chamar o método da biblioteca legada
        System.out.println("Adapter: Convertendo dados do objeto Vehicle para String...");
        oldStorage.storeVehicleData(vehicleDataAsString);
        System.out.println("Adapter: Dados enviados para a biblioteca legada.");
    }

    private String convertVehicleToString(Vehicle vehicle) {
        return "ID:" + vehicle.getId() + "|MODEL:" + vehicle.getModel() + "|YEAR:" + vehicle.getYear();
    }
}