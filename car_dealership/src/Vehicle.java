import java.util.Objects;

public class Vehicle {
    private String Make;
    private String Model;
    private String type;
    private double price;

    public Vehicle(String make, String model, String type, double price) {
        Make = make;
        Model = model;
        this.type = type;
        this.price = price;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 && Objects.equals(Make, vehicle.Make) && Objects.equals(Model, vehicle.Model) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Make, Model, type, price);
    }
}
