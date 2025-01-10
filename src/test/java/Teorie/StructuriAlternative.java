package Teorie;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structurile alternative = If - then - else; switch - case;

    @Test
    public void metodaTest() {
        //metodaVerificareNumar(7);
        //metodaVerificareNumar(3);
        //metodaVerificareNumar(5);
        metodaVerificareNumarParPozitiv(0);
        metodaVerificareNumarParPozitiv(4);
        metodaVerificareNumarParPozitiv(3);
        metodaVerificareNumarParPozitiv(-1);
        metodaVerificareNumarParPozitiv(-8);
    }

    // Verificam un numar mai mare decat 5

    public void metodaVerificareNumar(int valoare) {
        if (valoare > 5) {
            System.out.println("Numarul " + valoare + " este mai mare decat 5");
        }

        else if (valoare < 5) {
            System.out.println("Numarul " + valoare + " este mai mic decat 5");
        }

        else {
            System.out.println("Numarul " + valoare + " este egal cu 5");
        }

    }

    // Verificam daca un numar e par pozitiv sau par negativ

    public void metodaVerificareNumarParPozitiv(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + valoare + " este impar pozitiv");
            }
        }
        else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + valoare + " este impar negativ");
            }
        }
        else if (valoare == 0) {
            System.out.println("Numarul " + valoare + " este zero");
        }

    }

}
