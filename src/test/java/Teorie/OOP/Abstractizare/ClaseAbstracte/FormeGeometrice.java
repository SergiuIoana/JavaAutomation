package Teorie.OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGeometrice {

    public String culoare = "albastru";

    public abstract void calculeazaAria();

    public void deseneaza(){
        System.out.println("Deseneaza forma");
    }
}
