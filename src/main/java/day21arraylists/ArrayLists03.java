package day21arraylists;

import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        //Kisa yoldan bir list nasil olusturulur?
        //Lİst.of() methodu degistirilemez bir list olusturmak icin kullanilir,
        //Degisiklik yapmaya yonelik methodlari desteklemez
        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d, k]
        //initialis.add('b');
        //initials.remove(initials.indexOf('k'));
        //initials.set(0,'u');
        System.out.println(initials);//[a, k, c, d, k]




        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumun indexini verir.
        int r1 = initials.indexOf('k');
        System.out.println(r1);

        //lastIndexOf(aranan kaarakter) methodu aranan karakterin son gorunumunun index ini verir
        initials.lastIndexOf('k');
        int r2 = initials.lastIndexOf('k');
        System.out.println(r2);



    }
}
