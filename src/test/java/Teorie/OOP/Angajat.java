package Teorie.OOP;

public class Angajat extends Persoana implements AngajatInt{

    //Modificatorii de acces
    //public = codul se poate accesa de oriunde si de orice clasa
    //private = codul se poate accesa doar din clasa de unde s-a scris codul
    //protected = codul se poate accesa doar din pachetul in care s-a scris codul, dar si de catre subclase (conceptul OOP de mostenire)
    //default = codul se poate accesa doar din pachetul din care s-a scris codul. Intra pe default daca nu se specifica un alt modificator de acces


    private String firma;
    private Integer experienta;
    private Integer zileConcediu;

    public Angajat(String nume, String prenume, Integer varsta, String firma, Integer experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Firma la care lucreaza angajatul este: " + firma);
        System.out.println("Experimenta angajatului este de: " + experienta + " ani");
        System.out.println("Angajatul are: " + zileConcediu + " zile de concediu");
    }

    //Suprascriem metoda din parinte (polimorfismul dinamic)

    public void mananca(){
        System.out.println("Angajatul mananca cand are pauza de masa");
    }

    //Polimorfismul static
    public void marire(){
        System.out.println("Nu avem buget de mariri");
    }

    public void marire(Integer procent){
        System.out.println("Angajatul a primit o marire cu " + procent +"%");
    }

    public void marire(String grad){
        System.out.println("Angajatul a primit gradul " + grad);
    }

    public void promovare(){
        System.out.println("Angajatul cu numele " + getNume() + " a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }

    @Override
    public void mergemLaMunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul merge in pauza");
    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Angajatul nu pleaca din firma");
    }
}
