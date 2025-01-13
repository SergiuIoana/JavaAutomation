package Teorie;

import org.testng.annotations.Test;

public class Student {

    //Clasa = Sablon care defineste proprietatile si comportamenul unei entitati specifice
    //Intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa ai mai multe clase cu acelasi nume
    //Intr-o clasa putem defini proprietatile si actiunile unei entitati
    //Variabila = Proprietatea unei clase
    //
    //Variabilele pot fi de 2 feluri: Globale si locale
    //     Variabilele globale sunt vizibile peste tot in proiect
    //     Variabilele locale sunt vizibile doar in locul unde s-au declarat
    //Ca sa definim o variabila globala: accesscontrol(public) tip variabila, nume variabila
    //In momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare

    //Metoda = actiunea undei clase
    //Exista 2 tipuri de metode: void si return

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;

    @Test
    public void prezentareStudent(){
        Nume = "Ioana";
        Prenume = "Sergiu";
        Varsta = 31;
        Adresa = "Utrecht";
        Inaltime = 1.71;
        Greutate = 70.00F;
        Sex = 'M';
        AreDiploma = true;

        //System.out.println(Nume+" "+Prenume+" "+Varsta+" "+Adresa);
        //System.out.println(Inaltime);

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltime studentului este: " + Inaltime);
        System.out.println("Greutate studentului este: " + Greutate);
        System.out.println("Sex-ul studentului este: " + Sex);
        System.out.println("Are studentul diploma? " + AreDiploma);

        calculMedie();
        System.out.println(getSalariu());
    }

    public void calculMedie(){
        Integer nota1 = 8;
        Integer nota2 = 9;
        Integer nota3 = 10;
        Integer media = (nota1 + nota2 + nota3)/3;

        System.out.println("Media studentului este: " + media);

    }

    //Metoda cu return
    public Integer getSalariu() {
       Integer salariu = 5000;
       return salariu;
    }



}
