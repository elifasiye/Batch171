package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        1) Ayni data typeindaki coklu data lari depolamak icin Array kullaniriz
        2)Arraylerin bir negatif yonu var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
        3)Arrayler eleman sayisinda esnek degildirler. Bu yuzden Java "Arraylist"  yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
        1000 tane eleman koyarsaniz eleman sayisini 1000 olarak ayalar
        4)Arraylist yerine sadece List de diyebiliriz
        5)Java arraylistleri olusturduktan sonra Arrayleri iptal etmedi cunku ;
            a)Arrayler super hizlididr
            b)Arrayler memory de cok az yer kaplar
            c)Bu nedenle eleman sayisi belli olan data lari depolamak icin Array lar tercih edilir
        6) Arraylar primitive data type lari ve non-primitive data type larin referance larini depolayabilir.
        ama Arraylistler "non-primitive " data type larini depolar. Bu yuzden Arraylistler Arraylardan daha cok yer kaplar

         */


        //Arraylist nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        //Arraylist console a nasil yazdirilir?
        System.out.println(ages);


        //Arraylistlere eleman nasil eklenir?
        //Arraylistlere eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemnlari sizin verdiginiz sirada List e ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(5,888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List e coklu eleman nasil eklenir? veya List e baska bir List nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari once bir  List in icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

    ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayList de eleman sayisi nasil bulunur?
        //size() methodu bir Lİstteki eleman sayisini verir
        int numOfElement=ages.size();
        System.out.println(numOfElement);//12


        //ArrayListte specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar

         int eleman1=ages.get(1);
        System.out.println(eleman1);//656


        //Arraylistte specific bir eleman nasil degistirilir?
        ages.set(6,111);
        System.out.println(ages);

        ages.set(4,313);
        System.out.println(ages);

        //Bir Lİst teki tum elemanlari nasil silebilirim?
        ages.clear();
        System.out.println(ages);//[]


        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
       boolean r = ages.contains(656);
        System.out.println(r);


        //Bir ArrayListin bos olup olmadigini nasil kontrol edebiliriz?
        boolean r2 =ages.isEmpty();
        System.out.println(r2);

        //Ornek : Size verilen bir list in bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String>names= new ArrayList<>();

        System.out.println();

        names.add("Saadet");
        names.add("Ekim");
        names.add("Ali");

        // 1. way
        if (names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("Lİst has at least 1 element");
        }

        names.clear();


        //2. Way
    if (names.isEmpty()){
        System.out.println("Lİst is empty");
    }else{
        System.out.println("List has at least 1 element");
    }


    /*
    Bİr method ogrenirken 3 seyi ogrenin;
    1) O method ne is yapar?
    2) O method nasil kullanilir?
    3)O method size neyi verir?
     */


    }
}
