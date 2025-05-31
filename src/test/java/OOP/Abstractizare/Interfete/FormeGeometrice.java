package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {

    public static final String culoare = "verde"; //permite doar constante nu si fielduri/proprietati care nu sunt initializate
    //toate metodele declarate sunt by default abstracte

    void calculeazaAria();

    void deseneaza();

}
