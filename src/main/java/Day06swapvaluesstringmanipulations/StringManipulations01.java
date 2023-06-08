package Day06swapvaluesstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {

    public static void main(String[] args) {
        // String bir non-primitive data type dir ve ayni zamanda bir classdir

        String s = "Java is easy";

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY


        //Ornek2: "s" Stringindeki tum characterleri kucuk harf yapiniz

        String sLower = s.toLowerCase();

        System.out.println(sLower);//java is easy

        //Ornek3:  "s" Stringindeki ilk characteri aliniz

        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        //Ornek 4: "s" stringindeki bastan ikinci ve sondan ikinci characteri yazdirin

        char secondChar = s.charAt(1);
        System.out.println(secondChar);

        char secondLastChar = s.charAt(10);
        System.out.println(secondLastChar);


        System.out.println("" + secondChar + secondLastChar);//as

        //Ornek 5: "s" string inde kullanilan character sayisini bulunuz

        int sLenght = s.length();

        System.out.println(sLenght);//12


        //Ornek 6: "s" Stringindeki ilk 4 characteri aliniz
        //s.substring(0, 4) ==> bu kullanimda ilk index dahildir, ikinci index harictir
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//java

        //Ornek 7: "s" stringindeki is kelimesini aliniz

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);//is

        //ornek 8: "s" stringindeki easy kelimesini aliniz

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);//easy
        System.out.println(sub4);

        //Ornek 9: "s" Stringinde "money" kelimesinin var olu olmadigini kontrol ediniz

        boolean isExist = s.contains("money");
        System.out.println(isExist);



        //Ornek 10: "s" String nin belli bir harfle baslayip baslamadigini kontrol ediniz

       boolean isStart= s.startsWith("J");
        System.out.println(isStart);


        //Ornek 11: "s" Stringinin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayip baslamadigini kontrol ediniz


boolean isBegin=s.startsWith("i",5);
        System.out.println(isBegin);


    }
}
