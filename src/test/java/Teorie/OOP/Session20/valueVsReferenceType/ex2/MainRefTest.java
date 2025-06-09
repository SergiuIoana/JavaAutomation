package Teorie.OOP.Session20.valueVsReferenceType.ex2;

public class MainRefTest {

    public static void main(String[] args) {
        RefTest ref=new RefTest();
        System.out.println(ref);

        RefTest ref2=new RefTest();
        System.out.println(ref2);

        if (ref==ref2) {
            System.out.println("egale");
        }else{
            System.out.println("nu sunt egale");
        }
    }
}
