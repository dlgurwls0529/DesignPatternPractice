package Creation.Singleton;

public class HolderSingleton {

    private HolderSingleton() { };

    private static class Holder {
        public static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }
}
