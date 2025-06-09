package Teorie.OOP.Session20.valueVsReferenceType;

public class ReferenceType {
    public static void main(String[] args) {
        String str1=new String("hello");
        String str2=new String("hello");
        //String str2=str1;

        int intreg1=5;
        int intreg2=5;

        if (intreg1==intreg2){
            System.out.println("valorile sunt la fel");
        }else{
            System.out.println("valorile nu sunt la fel");
        }

        System.out.println("-------------------------------------");

        if (str1==str2){
            System.out.println("valorile sunt la fel");
        }else{
            System.out.println("valorile nu sunt la fel");
        }
    }
}
