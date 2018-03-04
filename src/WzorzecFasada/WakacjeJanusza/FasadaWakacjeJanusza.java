package WzorzecFasada.WakacjeJanusza;

public class FasadaWakacjeJanusza {

    Dolek dolek;
    Dom dom;
    Grazyna grazyna;
    Morze morze;
    Parasol parasol;
    Parawan parawan;
    Piwo piwo;

    public FasadaWakacjeJanusza(Dolek dolek, Dom dom, Grazyna grazyna, Morze morze, Parasol parasol, Parawan parawan, Piwo piwo){
        this.dolek = dolek;
        this.dom = dom;
        this.grazyna = grazyna;
        this.morze = morze;
        this.parasol = parasol;
        this.parawan = parawan;
        this.piwo = piwo;
    }

    public void rozpocznijPlazowanie(){
        dom.idzNaPlaze();
        piwo.otworz();
        parawan.rozloz();
        parasol.rozloz();
        dolek.wykop();
        piwo.otworz();
        grazyna.zadzwon();
        morze.wykapSie();
        grazyna.podajPiwo();
        grazyna.krzycz();
        grazyna.obraz();
    }

    public void zakonczPlazowanie(){
        parasol.zloz();
        parawan.zloz();
        dolek.zasyp();
        piwo.otworz();
        dom.odnajdz();
    }
}
