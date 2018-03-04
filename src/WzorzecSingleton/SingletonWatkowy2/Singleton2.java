package WzorzecSingleton.SingletonWatkowy2;

public class Singleton2 {

    // tworzymy instancje juz na początku, aplikacja bedzie sie dluzej wczytywac,
    // niezbyt dobre rozwiazanie gdy nie mamy pewnosci, ze bedziemy korzystac z tego obiektu

    private static Singleton2 unikalnaInstancja = new Singleton2();

    private Singleton2(){}

    public static Singleton2 pobierzInstancje(){
        return unikalnaInstancja;
    }

}
