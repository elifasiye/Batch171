package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Ornek 1 : Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        // abc@gmail.com ===> gmail

        String a = "abc@gmail.com";

        int sartingIndex= a.indexOf('@')+1;
        int endingIndex =a.indexOf('.');

        String  companyName=a.substring(sartingIndex, endingIndex);
        System.out.println("companyName =" + companyName);//gmail


        // Ornek 2 : Verilen iki stringin birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz

        String h="ali Can";
        String i = "Ali Can";

        boolean result =h.equals(i);

        System.out.println(result);//false


        //---------------------------------------------------------------



        //java da memory kullanimi
        /*
        java da iki tane memory vardir
        1) Stack memory ==> Small
            a)kucuk memorydir
            b)primitive leri ve Non-primitive lerin adreslerini(reference) tutar.


        2) Heap memory ==> Huge
            a)Buyuk memory dir
            b)Non- primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum non- primitive datalar icin bir adres olusturur
          ve bu adresi stack memory de saklar
         */


        /*
        NOTE : String'lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku ; "==" sembolu iki Stringi karsilastirirken hem adreslerine hem de degerlerine bakar,
        ikisi de ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil,
        degerleri ile ilgileniriz. Bu yuzden string karsilastirmalarinda "==" kullanmayiz


        "equals()" methodu ise iki stringi karrsilastirirken sadece degerlerine bakar.
        Degerleri ayni ise bu iki string esittir der, degerleri farkli ise bu iki string farklidir der ki bu bizim code yazarken ihtiyac duydugumuz seydir
            */

         String s = "Tom";
         String t = "Terry";
         String r= new String("Tom");

        System.out.println(s==t);//false cunku adres ve deger farkli
        System.out.println(s.equals(t));//false cunu degerler farkli
        System.out.println(s==r);//false cunku adresler farkli
        System.out.println(s.equals(r));//true cunku equls sadece degerlere bakar "s" ve"r"nin degerleri ayni olunca true verir

       // ---------------------------------------------------------------

//Ornek 3 : Verilen iki stringin birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrolceden kodu yaziniz

        String j = "ali Can";
        String k = "Ali Can";
        boolean result3=j.equalsIgnoreCase(k);
        System.out.println(result3);//true


        /* HOMEWORK
        1) Bir String variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        2) Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        3) Bir String variable olusturunuz ve bu stringdeki ilk ve son karakterlerini ASCII degerleri toplamini console a yazdiri
        4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehiir isminin ilk harfi buyuk harfle diger harflerini kucuk harflerle cosole a yazdirin
        5) Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
            a) En az 6 character olsun
            b) En az bir tane buyuk harf olsun
            c) En az bir  tane kucuk harf olsun
            d) En az bir tane rakam olsun


            Note 1 : canli oturumda cozulen ornekleri yapiniz
            Note 2 : Tum sorulari dinamik kod ile coz (hard kod ile degil)

         */









    }
}
