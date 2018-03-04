package WzorzecFasada.Ubrania;

import WzorzecFasada.Ubrania.Stroje.*;

public class FasadaLato {

   private Shorts shorts;
   private Sunglasses sunglasses;
   private TShirt tShirt;

   public FasadaLato(Shorts shorts, Sunglasses sunglasses, TShirt tShirt){
       this.shorts = shorts;
       this.sunglasses = sunglasses;
       this.tShirt = tShirt;
   }

   public void ubierzStrojLetni(){
       shorts.ubierzSie();
       tShirt.ubierzSie();
       sunglasses.ubierzSie();
   }

   public void zdejmijStrojLetni(){
       shorts.rozbierzSie();
       tShirt.rozbierzSie();
       sunglasses.rozbierzSie();
   }

}
