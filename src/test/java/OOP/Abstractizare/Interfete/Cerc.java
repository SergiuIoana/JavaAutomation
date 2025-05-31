package OOP.Abstractizare.Interfete;

public class Cerc implements FormeGeometrice, FormeGeometrice2 {

    private int raza;

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public void deseneaza() {
        System.out.println("deseneaza cerc");
    }

    @Override
    public void calculeazaAria() {
        System.out.println("Aria cercului este egala cu: " +  Math.PI*Math.pow(raza, 2));

    }
}
