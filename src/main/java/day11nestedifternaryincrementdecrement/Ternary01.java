package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Ternary Statement
        //Ornek 1 : SAyi 10 dan kucuk ise console a "kucuk" yazdirin degil ise "kucuk degil" yazdirin


        int num = 13;
        if (num < 10) {
            System.out.println("kucuk");
        } else {
            System.out.println("kucuk degil");
        }


        //--------ternary cozumu-------------
        //Condition   ? Condition true ise calisir :  Condition false ise calisir ;

        String sonuc = num < 10 ? "kucuk" : "buyuk";
        System.out.println(sonuc);

//Ornek 2 : sayi cift ise console a "cift" , tek ise "tek" yazdirin

            int k = 13;
            if(k%2==0){
                System.out.println("Cift");
            }else{
                System.out.println("Tek");
            }


            // ----------ternary cozumu -----------
                // Condition   ? Condition true ise " cift"  calisir  : false ise  "tek" calisir

        String result = k%2==0  ? "Cift"  : "Tek";
        System.out.println(result);



        //Ornek 3 : Sayi 0 dan buyuk ise "pozitif" degilse "negatif" yazdirin

        int i=5;
        System.out.println();
        System.out.println(i>0 ? "Poazitif" : "Negatif");

        //Ornek 4 : Kullanicidan 2 sayi aliniz, buyuk olmayan (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz:");

        double a = input.nextDouble();
        double b= input.nextDouble();

        //1. yol if else
        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2. yol Ternary
      double result2 =   a<b  ?  a : b;
        System.out.println(result2);


    }
}
