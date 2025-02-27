package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    //multimi: array, list, map

    @Test
    public void metodaTest() {
        //colegiCursArray();
        //colegiCursLista();
        //categoriiObiecte();
        tariOrase();

    }
    //exemplu array
    public void colegiCursArray(){
        String[] colegi = new String[6];
        colegi[0] = "Sergiu";
        colegi[1] = "Maria";
        colegi[2] = "Alex";
        colegi[3] = "Bob";
        colegi[4] = "Jack";
        colegi[5] = "Alex";

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului este: " + colegi[index]);
        }
    }

    //exemplu lista
    public void colegiCursLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Sergiu");
        colegi.add("Maria");
        colegi.add("Alex");
        colegi.add("Bob");
        colegi.add("Jack");
        colegi.add("Alex");

        int index=0;
        while(index<colegi.size()){
            System.out.println("Numele colegului este: " + colegi.get(index));
            index++;
        }
    }

    //exemplu map
    //map -> cheie = valoare
    public void categoriiObiecte(){
        HashMap<String,String> obiecte = new HashMap<>();
        obiecte.put("obiect","laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare","trandafir");
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));
        }
    }

    public void tariOrase(){
        HashMap<String,List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Targu Mures");
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Iasi");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Florenta");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Malaga");
        oraseSpania.add("Madrid");

        clasificare.put("Romania",oraseRomania);
        clasificare.put("Italia",oraseItalia);
        clasificare.put("Spania",oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }
    }
}
