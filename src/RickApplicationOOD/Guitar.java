package RickApplicationOOD;

public class Guitar {
    private String serialNumber;
    private double Price;
    private String model;
    private Type type;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Guitar(String serialNumber, double price, String model, Type type) {
        this.serialNumber = serialNumber;
        this.Price = price;
        this.model = model;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }
}
