package PracaDomowa.Zadanie4Fasada;

import PracaDomowa.Zadanie4Fasada.Ingredients.Basis;
import PracaDomowa.Zadanie4Fasada.Ingredients.Sugar;
import PracaDomowa.Zadanie4Fasada.Ingredients.Talc;

public class Demo {
    public static void main(String[] args) {

        ProductFasade product = new ProductFasade(new Robot(), new Basis(), new Sugar(), new Talc());
        product.making();
    }
}
