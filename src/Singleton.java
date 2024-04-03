// the singleton can only have 1 instance
// existing at a time
// and there is a
// global point of access to it
public class Singleton {
    // volatile would let 2 threads properly use the class
    // as if without it, one thread might use the instance
    // of the class, before the other thread even creates it
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        // declare result, so we don't access the memory twice
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                // again, to reduce memory use
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
