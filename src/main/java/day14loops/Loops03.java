package day14loops;

import java.util.Scanner;

public class Loops03 {
    public  static void main(String[] args) {

        /* Example 1 : Kullanicidan baslangic ve bitis degerlerini alin
        Baslangic degerinden aslayip bitis degerine kadar  aradaki tum cift tam sayiari ekrana yazdiriniz
        9-14==> 10  12  14
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz :");
        int start = input.nextInt();

        System.out.println("Bitis degerini giriniz : ");
        int end = input.nextInt();

        if (start>end){
            System.out.println("Baslangıc degeri bitis degerinden buyuk olamaz");
        }else {

            for (int i = start; i < end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }
        }


        //Ornek 2 : Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz

        for (int i ='d'/'d' ; i<='d' ; i++  ){
            System.out.print(i+ " ");
        }



        //ASCII DEGERİ OGRENME :
        // int d ='d';
        //System.out.println(d);


        /*
        NOT 1 :  Bazi looplar sonsuz defa calisabilir, Bu tarz looplara Infinite(sonsuz) loop denir
        Infinite (sonsuz) loop genellikle " increment/decrement" kisminda yapilan hatadan kaynaklanir

        for( int i = 1 ; i<10 ; i --){
       }

        NOte 2 :  loop olusturdugumuzda "ikinci kismi" (loop calisma sarti) yazmazsaniz Infinite(sonsuz) loop olur
             for( int i = 1 ; i<10 ; i --){
            }
        Note 3 : Bazi loop lar hic calismayabilir
        for (int i = 1 ; i<0 ; i--){
        }
         */

    }
}

