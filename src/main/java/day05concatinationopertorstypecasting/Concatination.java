package day05concatinationopertorstypecasting;

import java.security.spec.RSAOtherPrimeInfo;

public class Concatination {
    public static void main(String[] args) {


        //Ornek 1 : Bİr string ve iki integer variable  olusturun. String degeri ile Integer larin toplamini consola yazdirin

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s + (a + b));//elma21
        System.out.println(s + a * b);//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b);//10elma11


        //Java da "+" sembolu iki sayi arasinda kullanilirsa tolama islemi olur
        //Java da "+" sembolu iki string arasinda kullanilirsa "concantination" islemi olur
        //"Concantination" birlestirme  yapar
        //Note : Concantination islemlerindemjava matematikteki islem onceligi kurallarini kullanir


        //Ornek : Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz


        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt + shoes);

        //Integer.valueOf() strin degerleri integer a cevirir

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);


//Ornek 3 : Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz

        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv + radio); //$1100300

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        //Note : valueof() methodu tum karakterleri rakam olan Stringleri sayilara cevirir
        //Eger valuof() methodu kullanilirken Stringin icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf methodu kullanilirken sadece rakam iceren  karakterler kullanilmalidir


    }
}
