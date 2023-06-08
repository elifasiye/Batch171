package Day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {


        String s = "Learn Java earn money";
        //Ornek 1: "s" String inin "mooney" ile bitip bitmedigini kontrol ediniz

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Ornek 2: "s" Stringindeki "money" kelimesini "dollar" kelimesine ceviriniz

        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar

//Ornek 3:  "s" Stringindeki "earn" kelimesini "win" kelimesine ceviriniz

        String s2 = s.replace("earn", "win");
        System.out.println(s2);//Lwin Java win money

//Ornek 4: "s" String indeki "a" harflerini "*" a ceviriniz

        String s3 = s.replace("a", "*");
        System.out.println(s3);//Le*rn J*v* e*rn money


        //Ornek 5: "s" Stringindeki tum  "n" harflerini "xxx" a ceviriniz

        String s4 = s.replace("n", "xxx");
        System.out.println(s4);//Learxxx Java earxxx moxxxey

        //Ornek 6: "s" Stringindeki "e" harflerini siliniz

String s5=s.replace("e", "");
        System.out.println(s5);//Larn Java arn mony


        String t ="Ali 13 yasindadir!...";

        //Note : Bir grup datayi ifade etmek icin "Regulaar Experissons" regex kullaniriz
        //NOTE : Bİr grup datayı degistirmek icin replaceAll()kullanilir
        /*
                Meshur Regex
         1)Tum  rakamlar ==>[0-9]
         2)Tum kucuk harfler ==> [a-z]
         3)Tum buyuk harfler==>[A-Z]
         4)Tum kucuk ve buyuk hharfler==>[a-zA-Z]
         5)Tum harfler ve rakamlar==>[a-zA-Z0-9]
         6) Tum noktalama isaretleri==>\\p{Punct}
         7) Tum sesli harfler==> [aeiouAEİOU]

         8)Kucuk harflerden farkli tum characterler==>[^a-z]
         9)Tum harflerden farkli tum characterler ==>[^a-zA-Z]
       */

        //Ornek 7: "t" Stringindeki tum rakamlari "*" a ceviriniz

      String t1=  t.replaceAll("[0-9]", "*");
        System.out.println(t1);





    }
}
