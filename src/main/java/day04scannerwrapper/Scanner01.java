package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Ornek kullanicidan ilk ve son ismi alıp ikisini ayni satirda yazdir
        //1. adim scanner classtan bir object olustur

        Scanner input = new Scanner(System.in);
        System.out.println();

        // 2.adım Kullaniciya ne istedigine dair mesaj ver
        System.out.println("İlk isminizi giriniz:");

        //3. adim : uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz:");
        String lastName = input.next();
        System.out.println(firstName + lastName);
        //next() methodu kullaniciddan tek kelimeli string almak icin kullanilir


    }
}
