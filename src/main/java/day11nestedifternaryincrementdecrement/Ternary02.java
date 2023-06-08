package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {

        //Ornek:

        int a= 10;
        int b = 20;

        int r1=a<b ? a++ : ++b;
        System.out.println(r1);
        System.out.println(a);
        System.out.println(b);


        //Ornek 2 : Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //          -4 ==>  -1*-4        4==>4       0==>0

        int c = 4;
        int result2 =c<0 ? -1*c : c;

        System.out.println(result2);

        //Ornek 3: iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n=-6;

        Object r3 =(m>0 && n>0) || (m<0 && n<0)  ?  m*n : "farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        //Object java da butun non-primitive data type (Class) ' larinin ortak "Parent" (anne-baba) idir
        // "Object"in parent i yoktur
        // Farkli data type lari icin ortak bir variable olusturmak istediginizde , data type olarak object kullanabilirsiniz
        //Java da "object" , insanlık aleminde "Hz. Adem' e benzer"



        //Ornek 4 :Size verilen bir sayinin 3 basamaklş olup olmadigini kontrol ediniz
        int p=-313;
        p=Math.abs(p);
      String r4 =  p>99 &&p<1000 ?  p + " uc basamaklidir" : p+  " uc basamakli degildir";

      System.out.println(r4);


    }
}
