package AbstractFactory.Asus;

import AbstractFactory.Company;
import AbstractFactory.Gpu;
import AbstractFactory.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
