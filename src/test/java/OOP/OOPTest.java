package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void metodaTest() {
        Student Cristi = new Student("Pop", "Cristi", 25, "UBB", "2", true);
        Cristi.infoStudent();

        Angajat Tudor = new Angajat("Popescu", "Tudor", 27, "Panemar", 3, 22);
        Tudor.infoAngajat();

        Tudor.promovare();
    }
}
