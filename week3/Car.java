package week3;

public class Car {
    private String model;
    private int price;
    private final double fuelLevel;

    public Car(String model, int price, double fuelLevel) {
        this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public static void main(String[] args) {
        // Create a Car object
    }
}
      
