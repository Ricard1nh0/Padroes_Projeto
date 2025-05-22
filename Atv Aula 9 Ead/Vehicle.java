public class Vehicle {
    private String id;
    private String model;
    private int year;

    public Vehicle(String id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }
    
     // facilitar a conversão para String no Adapter
    @Override
    public String toString() {
        return "ID: " + id + ", Model: " + model + ", Year: " + year;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}