package BuilderPattern;

public class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;

    public CarBuilder id(int id) {
        this.id = id;
        return null;
    }
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return null;
    }
    public CarBuilder model(String model) {
        this.model = model;
        return null;
    }
    public CarBuilder color(String color) {
        this.color = color;
        return null;
    }

    public Car build() {
        return new Car(id, brand, model, color);
    }
}
