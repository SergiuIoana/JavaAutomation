package Teorie.Exceptii;

public class Exceptia1 {
    // Exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestiuia
    // Ofera un mecanism eficient de identificare si rezolvare a erorilor
    // Sunt modelate sub forma de clase: clasa Error, Clasa exception, Clasa runtime exception, clase personalizate
    // Exceptiile sunt gestionate folosind cuvinte predefinite in java: try - catch si finally
    // Sunt 2 tipuri mari de exceptii: checked si unchecked
    // Erorile checked: sunt exceptii de compilare (nu se poate buld-ui sau rula proiectul).
    // Exemple de erori checked : SQLException, IOException, ClassNotFoundException
    // Erori unchecked : sunt exceptii de runtime care sunt ignorate in timpul compilarii dar sunt aruncate in timpul executiei programului
    // Exemple de erori unchecked: NullPointerException, ArrayIndexOutOfBound, ArithmeticException
    // throw: este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod
    // throws: este un cuvant cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe de exceptii

    public static void main(String[] args) throws ExceptieCustom {
 /*     try{
            System.out.println(12/0);
        }
        catch(ArithmeticException e){
            System.out.println("Error Arithmetic exception thrown " + e.getMessage());
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
 */
        try {
            int[] numbers = new int[10];
            Thread.sleep(5000);
            numbers[11] = 5;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println(e.getMessage());
            throw new ExceptieCustom("Eroare personalizata!");
        }
        finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa!");
        }
    }
}
