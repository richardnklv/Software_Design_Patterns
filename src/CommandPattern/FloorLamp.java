package CommandPattern;

public class FloorLamp {
    private Light light;

    public FloorLamp() {
        this.light = new Light();
    }

    public void switchLights() {
        light.switchLights();
    }
}
