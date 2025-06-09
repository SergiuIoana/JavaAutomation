package Teorie.OOP.Session20.FinalAccessModifiers.ex1;

public class FinalExample {

    // final keyword poate fi aplicat pentru outer class, inner class, variabile.field si metode
    // nu poate fi aplicata la interfete, constructor, blocks si enum
    // final class - nu poate fi extinsa/mostenita
    // final method - nu poate fi suprascrisa
    // o variabila declarata si initializata - nu poate fi schimbata

    static int a=123;
    static final int ROTI_MASINA=4;


    public static void main(String[] args) {
        System.out.println("a= " +a);
        a=a+1;
        a++;

       // ROTI_MASINA=5;
    }

}
