package day05concatinationopertorstypecasting;

public class Operators {


/* 1) + - / * islemleri java da matematikte kullanildigi gibi kullanilir
Note 1: int / int => int olur
Note 2: double + int ==> double oluur  Cunku; java da matematiksel islemlerde farkli data type lari kullanilirsa sonuc her zaman buyuk data type i  olur


   2) java da "Logical Operator" lar vardir AND ve OR islemleri Logical operatörlerdir
   i) AND(&&) isleminde true alabilmek icin her sey  true olmalidir
   AND islemi "perfectionist" tir
   AND isleminde bir tane false olmasi sonucu islemi false yapar

  ii) OR (||) isleminde bir tane true sonucu true yapmaya yeter
  OR isleminde sonucun false olmasi icin her sey false olmalidir
  OR islemi "polyanna" gibidir.

  iii)  NOT Operator (!) : true olani false yapar, false olani true yapar.
        ornegin;    !true ==> false
                    !false ==> true
                    !!true ==> true


    3)Comparison(Karsilastirma) Operators
        <, > , >= , <= , == , !=
        NOTE: Karsilastirma operatorlarini kullandiginizda kesinlikle boolean (true veya false) alirsiniz

       NOTE : Biz AND islemi icin && kullaniriz ama & kullanimda gecerlidir
       Farklari nelerdir?
       && kullanim ilk ifade false oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir
       cunku AND isleminde ilk ifade false ise digerlerinin bir onemi yoktur sonuc hep false olur
       & kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve dolayisiyla yavas calisir
       bu yuzden biz hep && kullaniriz

         */
public static void main(String[] args) {

    boolean first = 3<5;
    System.out.println(first);

boolean second= 2+3!=5;
    System.out.println(second);

    boolean third=2+3*5>=19;
    System.out.println(third);

    System.out.println (first +  " - " + second + "-" + third);

    System.out.println( first && second);
    System.out.println(first || second || third);
}

}