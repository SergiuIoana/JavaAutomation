package OOP;

public class Persoana {
    //OOP=programare orientata obiect
    //4 principii: mostenire, incapsulare, polimorfism, abstractizare
    //mostenire = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    //in Java putem mosteni o singura clasa
    //in momentul cand o clasa mosteneste alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
    //in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //constructorul din parinte in copil se apeleaza cu super

    //INCAPSULARE = procesul prin care tinem departe anumite informatii ca ele sa nu poata fi modificate
    //facem variabilele/metodele din public in private
    //private = access control care restricioneaza accesul doar in clasa respectiva
    //ca sa extragem/modificam o valoare a unei variabile private, ne folosim de metode get/set

    //POLIMORFISM = procesul prin care definim mai multe implementari pentru o metoda
    //poate fi de doua feluri: dinamic(OVERRIDE) si static(OVERLOAD)
    //Polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //Polimorfismul static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului sau tipului de parametrii

    //ABSTRACTIZAREA = reducerea unui element complex la un element mai simplu (reducerea completa a implementarii metodelor, lasand doar numele functilor, parametrii si tipul returnat
    //abstractizarea se poate obtine prin clase abstracte si/sau interfete
    //clasele abstractizate sunt utilizate pentru a declara caracteristici comune unor subclase
    //o clasa abtracta nu poate fi instantiata
    //o clasa abstracta poate fi tuilizata doar ca si superclasa pentru alte clase care extind clasa abstracta
    //clasa abstracta poate fi definita folosind modificatorul "abstract"
    //o clasa abstracta poate contine atribute si metode pe langa clasa abstracta

    //Interfata ofera raspuns lipsei mostemirii multiple
    //interfata creeaza un protocol pe care clasele trebuie sa il implementeze
    //interfata contine toate metodele abstracte ( e o clasa pur abstracta)

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana()
    {
        System.out.println("Numele este: " + nume);
        System.out.println("Prenume este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    //Definim prima implementare pentru o metoda (polimorfism dinamic)

    public void mananca(){
        System.out.println("Persoana mananca cand ii foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
