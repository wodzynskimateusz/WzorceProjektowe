package WzorzecSingleton.SingletonWatkowy3;

public class Singleton3 {

    // najlepsze z podejsc watkowych, tworzy waskie gardlo (synchronized) dopiero wtedy gdy sprawdzil,
    // ze nie ma juz wczesniej utworzonej instancji - robimy double check

    private volatile static Singleton3 unikalnaInstancja;

    private Singleton3() {}

    public static Singleton3 pobierzInstancje() {
        if (unikalnaInstancja == null) {
            synchronized (Singleton3.class) {
                if (unikalnaInstancja == null) {
                    unikalnaInstancja = new Singleton3();
                }
            }
        }
        return unikalnaInstancja;
    }

}
