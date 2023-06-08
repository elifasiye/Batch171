package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {

        //Ornek 1: Bir stringin hic character icermedigini(Bos string oldugunu) kontrol eden kodu yaz

        //1. yol : lenght() methodu ile cozum
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);


        //2. yol (tavsiye edilir) :

        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? " + result2);


        // Ornek 2 : bir string in space haric hicbir character icermedigini kontrol eden karakter yazininz

        String t = "        ";
        // 1. YOL :

        boolean return3 = t.replace(" ", "").length() == 0;
        System.out.println(return3);

        // 2. YOl :
        boolean return4 = t.replace(" ", "").isEmpty();
        System.out.println(return4);

        //3. YOL
        boolean resul5 = t.isBlank();
        System.out.println(resul5);
        // isBlank() methodu sadece space iceren Stringler icin true verir space disinda bir character var ise false verir
        //isBlank() methodu bos stringler içinde true verir
        //isBlank() methodu space + hicbir sey icin true verir
        //isEmpty() methodu sadece hicbir sey icin true verir




        //Ornek 3 : Bir string de a,i,e characterlerinin ilk gorunumlerinin index ini toplamini ekrana yazdiriniz
        //"java is easy to learn" ==> 1+5+8==14
        // 0123456789....index

        String r ="Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1


        int idxI =r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println( idxA+idxE+idxI);

        //Ornek 4 : Bir Stringdeki "Java" kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz
        //"Ah Java vah Java sensiz olmuyor Java."
        //indexOf("Java")  kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin(yani J nin) indexini almis olursunuz


        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");

        System.out.println(idxJava);//3

        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder

        int idxjava=u.indexOf("java");
        System.out.println(idxjava);//1


        //Ornek 5 : Bir string de a, e, i characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz

        String v ="Java is easy to learn";
       int idx0fa= v.lastIndexOf('a');
        System.out.println(idx0fa);//18

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi= v.lastIndexOf('i');
        System.out.println(idxOfi);


        System.out.println( idx0fa+idxOfe+idxOfi );//40

        //LastindexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder


  }
}
