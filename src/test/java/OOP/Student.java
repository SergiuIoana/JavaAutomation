package OOP;

public class Student extends Persoana {

    private String facultate;
    private String an;
    private Boolean bursa;

    public Student(String nume, String prenume, Integer varsta,  String facultate, String an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent()
    {
        infoPersoana();
        System.out.println("Facultate este: " + facultate);
        System.out.println("Anul in care se afla studentul este: " + an);
        System.out.println("Studentul ia/nu ia bursa?: " + bursa);
    }

    public void absolvire(){
        System.out.println("Studentul cu numele " + getNume() + " si prenumele " + getPrenume() + " a absolvit");
    }

    public void mananca() {
        System.out.println("Studentul mananca cand vrea el");
        super.mananca();
    }

    public String getAn() {
        return an;
    }

    public String getFacultate() {
        return facultate;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }
}
