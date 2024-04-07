package BuilderPattern;


public class Main {
    public static void main(String[] args) {
        // to create a new car we can this:
        // as a simple builder
        CarBuilder builder = new CarBuilder();
        builder.id(2122)
                .brand("Audi")
                .model("RS7")
                .color("Matte Black");

        // Director way of creating a car
        Director director = new Director();
        CarBuilder builder1 = new CarBuilder();
        director.buildAudi(builder);
        Car car = builder1.build();
    }
}