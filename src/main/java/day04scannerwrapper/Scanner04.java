package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Ornek: Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        //a)Alanini heaplayiniz
        //b) Cevresini hesaplayıiniz


        Scanner input = new Scanner(System.in);
        System.out.println("Kisa kenar uzunlugunu giriniz:");
        double shortSide = input.nextDouble();

        System.out.println("uzun kenar uzunlugunu giriniz:");
        double longSide = input.nextDouble();

        System.out.println(shortSide*longSide);

        System.out.println(2*shortSide+2*longSide);



    }

}
