package WzorzecStrategia.Kaczka;

import WzorzecStrategia.Kaczka.SposobyKwakania.KwakanieInterfejs;
import WzorzecStrategia.Kaczka.SposobyLatania.LatanieInterfejs;

public abstract class Kaczka {

    protected LatanieInterfejs latanieInterfejs;
    protected KwakanieInterfejs kwakanieInterfejs;

    public void wykonajKwacz(){
        kwakanieInterfejs.kwacz();
    }

    public void plywaj(){
        System.out.println("Pływu pływu");
    }

    public void wyswietl(){
        System.out.println("Wyświetlam kaczkę");
    }

    public void wykonajLec() {
       latanieInterfejs.lec();
    }

    public void setLatanieInterfejs(LatanieInterfejs latanieInterfejs){
        this.latanieInterfejs = latanieInterfejs;
    }


}
