package TemplateMethodPattern;

public abstract class BaseGameLoader {
    public void load() {
        // the template that is repeated when loading games
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();

}
