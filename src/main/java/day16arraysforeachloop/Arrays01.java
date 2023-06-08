package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a =13;
        // Bu yapinin icinde sadece bir tane data depolanabilir
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu ata depolayabilme icin java Array yapisini olusturmustur


        //Array nasil olusturulur?
        String stdNames [] = new String [5];

        //Arraylar consoole a nasil yazdirilir
        //toString() methodu nu kullanmadan sadece array ismi ile yazdirirsaniz java ya arrayin adresini yazdirir
        System.out.println( Arrays.toString(stdNames ));

        /*
        Array lar diger collectionlardan cok cok daha hizlidir(superfast).
        Arrayler diger collectionlardan daha az memory kullanirlar
         */


        //Array e eleman ekleme nasil yapilir?
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[1]="Ekim";
        stdNames[0]="Elif";


        System.out.println(Arrays.toString(stdNames));


        //Array dan specific bir elemani nasil aliriz?
        System.out.println(stdNames[3]);
        System.out.println(stdNames[0]);



        //Ornek 1 : Array daki her elemanin sonuna '!' isareti koyarak yazdiriniz.

        for (int i = 0 ; i < stdNames.length ; i++) {
            System.out.println(stdNames[i]+ "!");

        }










    }
}
