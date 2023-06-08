package day01variables;

public class Variables01 {


public static void main(String[] args){

    //açıklama satırı
    /* Java bu satırları okumaz */
//varisble nasıl oluşturulur
 // Data type + Variable name+ Atama Operator (Assignment Operatoru) + Variable degeri + noktali virgül
     int          age                       =                               13              ;

//Ornek1 ogrenci ismi icin variable olusturup deger alarakAli Can atayınız

     String ogrenciAdi = "Ali Can";


     //Stringlere verilen degerler mutlaka cift tırnak icine yazilmalidir.
     //String ler icin "default value"(==>varsayilan deger) "null" dir.
     //String bir variable olusturdugumuzda cogu zaman ona bir deger atarız. Atama yapmazsak, java o variable a varsayilan deger olarak null koyar.
     // Null demek 0 demek degildir. 0 da coding te bir degerdir, null hiclik demktir, icinde variable ya da method bulunmayan obje demektir.


     // char data type
     /* tek karakterer icin kullanılır. Sayi sembol ya da harf...
     ornegin==> A,x,5,?...

     Ornek2: char data tipinde bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayınız

      */
   char  IsminIlkHarfi = 'A';

   char AlfabedenSecilenBirHarf = 'G';

   boolean isRetired = false ;

   //BYTE  Ornek 4 : byte data tipinde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

    byte ogrenciyasi = 18 ;

    //short data type
    //tam sayilar icin kullanilir, hafizada 2 byte yer kaplar
    //short : -32768 den +32767 e (dahil) kadar tam sayi degerleri icin kullanilir

    //Ornek 5 : Site nufusu icin bir variable olusturup deger atayiniz
    short siteNufusu =1300;



    //int data type
    //tam sayilar icin kullanilir,hafizada 4 byte yer kaplar.
    //int : -2,147,483,648  ile  2,147,483,647 (dahil) kadar tam sayi degerleri icin kullanilir

    //Ornek 6 :ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz
    int ulkeNufusu = 245587544;


    //long data type:
    //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar
    //long -9,223,372,036,854,775,888  ile 9,223,372,036,854,775,887 (dahil) kadar tam sayi degerleri icin kllanilir

    //Ornek 7 : Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz

    //Note : Bir deger long ise sonuna "L"(tavsiye edilir) "l" konulur
    long insanVucudundakiHucreSayisi= 946451346646464L ;

    // Eger long a atadiginiz deger int lerin araliginda ise sonuna "L" koymaya gerek yok
    //long dememize ragmen L koymazsak eger int araliginda ise java onu int olarak kabul eder
    long weightOfSun =1234561213;


    //float data type : 4 byte yer kaplar
    //float virgullu sayilar (Decimal Number==> ondalikli sayilar) icin kullanilir (Fiyatlandirmalar - 12.99)

    //Ornek 8 : Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturun

    //Java ondalikli sayilari otomatik olarak "double" olarak kabul eder.
    //Siz data type ini float yazarsaniz hata alirsiniz, float olmasinda israar ediyorssaniz sonuna "F","f" koymalisiniz
    float gomlekFiyati = 12.99F  ;
    float ayakkabiFiyati=15.99F;


    //double data type : 8 byte yer kaplar
    //Ondalikli kismi icin daha fazla rakam alabilir. Hucre agirligi gibi bilimsel calismalarda kullanilabilir

    //Ornek 9 : Hucre agirligi ve Amipin agirligi icin iki tane variable olusturunuz
    double hucreAgirligi =0.0000000013;
    double amipAgirligi=0.000000000003;

    //Ornek10: Ogrenci notlari icin iki adet varieble olusturun ve toplamlarını ekrana yazdiriniz

    byte  note1=50;
    byte note2= 85;
    System.out.println(note1);
    System.out.println(note2);
    System.out.println(note1 + note2) ;

    //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
    //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar


    //homework
    /*
    1) 3 farkli data turunde variable olusturun ve bunlari farkli satirlarda  yazdirin
    2) ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
    3) iki tam sayi turunde variable olusturup toplamini yazin
     */




}

}




