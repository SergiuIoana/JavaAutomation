package Teorie;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest() {
        dateMasina("Audi","A4",2017);
        dateMasina("Audi","Q7",2017);

        calculMedie(5.0,10.0);
        calculMedie(7.0,8.0);
    }

        public void dateMasina (String param1, String param2, Integer param3) {
            marca = param1;
            model = param2;
            anFabricatie = param3;

            System.out.println("Marca masinii este: " + marca);
            System.out.println("Model masinii este: " + model);
            System.out.println("Anul fabricatie este: " + anFabricatie);


        }

        //calculam media la 2 numere

    public void calculMedie(Double nota1, Double nota2){
        Double rezultat = (nota1 + nota2)/2;
        System.out.println("Media celor 2 note este: " + rezultat);

    }
    }

