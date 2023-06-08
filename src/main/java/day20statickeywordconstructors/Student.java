package day20statickeywordconstructors;

public class Student {

    /*
    1) Statc variable veya static methodlar (class member) tum object'ler icin ortak elemandir.
    2) Static class member lar uzerinde yapilan tum degisikler tum objectleri etkiler.
    3) Static class member ler class'a non-static class memberler objectlere monte edilir.
    Mesela ; bir classtan 100 tane object olusturdugunuzda non-static olanlar 100 defa olusturulur,
    ama static olanlar object sayisindan bagimsiz olarak 1 kere olusurulur.
    4) Static class member lara ulasmak icin object olusturmaya gerek duyulmaz.
    ama nonstatic class memberlara ulasmak icin object olusturmak sarttir.
    5)static variable larin  diger adi "Class Variable" dir.
   non-sttaic variable larin diger adi "Instaance Variable" veya "Object Variable" dir
     */

    public static String stdName = "Tom Hanks";
    public int age = 13;

    public static void staticMethod(){
        System.out.println("Ben Static Methodum.");

    }

public void nonStaticMethod(){
    System.out.println("Ben static olmayan methodum.");
}














}
