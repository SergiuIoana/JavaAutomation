package Teorie.OOP.Session20.staticEx.ex1;

public class StaticAccessModifiers {

    //STATIC
    //Un modificator static poate fi aplicat la nivel de variabila, metoda, bloc de initializare, inner class sau inner interface
    //o proprietate/metoda statica se poate apela prin numele clasei de ex NumeClasa.proprietate sau NumeClasa.metoda
    //eficientizeaza folosirea memoriei

    static String name = "ENDAVA";

    public static void printMessage(){
        System.out.println("Printeaza metoda");
    }
}
