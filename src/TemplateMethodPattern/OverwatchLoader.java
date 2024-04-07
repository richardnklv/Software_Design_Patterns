package TemplateMethodPattern;

public class OverwatchLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Overwatch objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Loading Overwatch profiles...");
    }
}
