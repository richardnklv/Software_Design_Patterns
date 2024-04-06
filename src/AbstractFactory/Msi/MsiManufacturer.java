package AbstractFactory.Msi;

import AbstractFactory.Company;
import AbstractFactory.Gpu;
import AbstractFactory.Monitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
