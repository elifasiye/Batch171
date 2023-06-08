package day04scannerwrapper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {


        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu gir


        Scanner input = new Scanner(System.in);
        System.out.println("5 basamkli bir sayi giriniz:");
        int number = input.nextInt();


        // %  ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalanini verir.
        //bir sayinin son rakamini alabilmek için o sayiyi 10 a bölün ve kalanini alin.
        // bir tam sayiyi başka bir tam sayiya bölersen java sonucu kesinlikle tam sayi yapar. yuvarlamaz
        //ondalikli kismi iptal eder dolayisi ile bir tam sayiyi 10 a bölersek birler basamagini silmis oluruz


//Son rakami al
        int birlerBasamagi = number % 10;
        //Saiyi kucult
        number = number / 10;


        // Sondan ikinci rakami al
        int sondanIkinci = number % 10;
        //sayiyi kucult

        number = number / 10;


        // sondan ucuncu rakami al
        int sondanUcuncu = number % 10;

        //sayiyi kucult
        number = number / 10;


        //sondan dorduncu rakami al
        int sondanDorduncu = number % 10;

        //sayiyi kucult
        number = number / 10;

        //sondan besinciyi al;
        int sondanBesinci = number % 10;

        // son rakam olduğu için sayiyi kucultmeye gerek yok

        System.out.println(sondanBesinci + sondanDorduncu + birlerBasamagi + sondanIkinci);


        /* homework
        1)Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yazdiriniz
        ornegin; 3 5 7icin (3+5+7)/3=5

        2) kullanicidan aldiginiz 3 basamali bir sayinin rakamlari toplamini bulunuz
        ornegin; 312 icin 3+1+2=6     */

    }
}
