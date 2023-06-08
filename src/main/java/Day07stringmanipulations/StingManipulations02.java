package Day07stringmanipulations;

import java.util.Scanner;

public class StingManipulations02 {
    public static void main(String[] args) {
        /*Ornek1 :
        Asagidaki kurallara göre kullanicinin girdigi password u kontrol ediniz
         1) En az 8 character olsun
         2) Space characteri password de olmasin
         3) En az bir buyuk harf olsun
         4) En az bir kucuk harf olsun
         5) en az bir rakam olsun

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz:");

        String pwd = input.nextLine();

      //1) En az 8 character olsun

        boolean first = pwd.length()>7;
        System.out.println("first: " + first);


        //2) Space characteri password de olmasin

        boolean second =!pwd.contains(" ");
        System.out.println("second = " + second);

       // 3) En az bir buyuk harf olsun
        boolean third= pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("third = " + third);


       // 4) En az bir kucuk harf olsun

        boolean fourth= pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("fourth = " + fourth);



       // 5) en az bir rakam olsun

       boolean fifth= pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("fifth = " + fifth);


        System.out.println(" Pasword gecerli mi ? " + (first && second && third && fourth && fifth));


    }
}
