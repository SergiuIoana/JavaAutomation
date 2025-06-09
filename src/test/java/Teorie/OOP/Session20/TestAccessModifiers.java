package Teorie.OOP.Session20;

public class TestAccessModifiers {

    public static void main(String[] args) {
        //StaticAccessModifiers staticAccessModifiers = new StaticAccessModifiers();
       // System.out.println(staticAccessModifiers.name);
        //staticAccessModifiers.name="new endava";
        //System.out.println(staticAccessModifiers.name);
        StaticAccessModifiers.name="new endava";
        System.out.println(StaticAccessModifiers.name);
        StaticAccessModifiers.printMessage();

        StaticAccessModifiers staticAccessModifiers2 = new StaticAccessModifiers();
        System.out.println(staticAccessModifiers2.name);
        // staticAccessModifiers2.name="new endava";
        // System.out.println(staticAccessModifiers2.name);



    }


}
