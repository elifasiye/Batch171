package day05concatinationopertorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {

        /*
         java da her karakterin sayisal bir degeri vardir
         Bu degerler ASCII degerler olarak nitelendirilir
         Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */

        char a= 'a';
        System.out.println(a); //a


        //Herhangi bir characterin ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyunuz

        int intA='a';
        System.out.println(intA); //97

        byte unlem= '!';
        System.out.println(unlem); //33

        char c1 = 'K';
        char c2= '?';
        System.out.println(c1+c2);//138
        // java da char lari matematiksel islemlerde kullanirsaniz, charlarin ASCII degerlerini kullanir.






    }
}
