package WzorzecSingleton.SingletonWatkowy1;

public class Singleton1 {

    private static Singleton1 unikalnaInstancja;

    private Singleton1() { }

    public static synchronized Singleton1 pobierzInstancje() {
        if (unikalnaInstancja == null)
            unikalnaInstancja = new Singleton1();
        return unikalnaInstancja;
    }
}
