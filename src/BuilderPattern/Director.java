package BuilderPattern;

public class Director {
    public void buildAudi(CarBuilder builder) {
        builder.brand("Audi")
                .color("Matte Black")
                .model("RS7");
    }
    public void buildMercedes(CarBuilder builder) {
        builder.brand("Mercedes")
                .color("Black")
                .model("G Class");
    }
}
