package TemplateMethodPattern;

public class WorldOfWarcraftLoader extends BaseGameLoader{

    @Override
    byte[] loadLocalData() {
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Wow objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Loading Wow profiles...");
    }
}
