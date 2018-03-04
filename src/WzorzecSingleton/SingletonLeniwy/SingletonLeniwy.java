package WzorzecSingleton.SingletonLeniwy;

public class SingletonLeniwy {
    private static SingletonLeniwy unikalnainstancja;

    private SingletonLeniwy(){}

    // logika

    public static SingletonLeniwy pobierzInstancje(){
        if (unikalnainstancja == null)
            unikalnainstancja = new SingletonLeniwy();

        return unikalnainstancja;
    }

    public void wyswietlKomunikat(){
        System.out.println("Komunikat z singletona");
    }
}
