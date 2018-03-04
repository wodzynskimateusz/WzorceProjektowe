package WzorzecFasada.Ubrania;

import WzorzecFasada.Ubrania.Stroje.*;

public class FasadaZima {

    private Gloves gloves;
    private Hat hat;
    private Scarf scarf;

    public FasadaZima(Gloves gloves, Hat hat, Scarf scarf){
        this.gloves = gloves;
        this.hat = hat;
        this.scarf = scarf;
    }

    public void ubierzStrojZiomowy(){
        gloves.ubierzSie();
        scarf.ubierzSie();
        hat.ubierzSie();
    }

    public void zdejmijStrojZimowy(){
        gloves.rozbierzSie();
        scarf.rozbierzSie();
        hat.rozbierzSie();
    }
}
