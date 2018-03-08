package PracaDomowa.Zadanie4Fasada;

import PracaDomowa.Zadanie4Fasada.Ingredients.*;

public class ProductFasade {

    private Robot robot;
    private Basis basis;
    private Sugar sugar;
    private Talc talc;

    public ProductFasade(Robot robot, Basis basis, Sugar sugar, Talc talc){
        this.robot = robot;
        this.basis = basis;
        this.sugar = sugar;
        this.talc = talc;
    }

    public void making(){
        robot.turnOn();
        basis.add();
        sugar.add();
        talc.add();
        robot.mix();
        robot.form();
        robot.turnOff();
    }

}
