package day21arraylists;

import java.util.*;

public class ArrayLists02 {
    public static void main(String[] args) {


        // Bİr List in baska bir List ile ayni olup olmadigini nasil kontrol edriz?
        // İki list in esit olabilmesi icin ayni index te ayni elemanlar olmalidir
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String>names2= new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Ornek : Sizeverilen iki integer listte tamamiyla ayni olup olmadigini kontrol eden kodu yaziniz
        ArrayList<Integer>nums1= new ArrayList<>();
        nums1.add(8);
        nums1.add(9);
        nums1.add(10);


        ArrayList<Integer>nums2= new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);



        //ArrayList te bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]

        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);

        //ArrayList te bir eleman index i kullanilarak nasil silinir?
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder



        //ArrayList olustururken sag tarafa(Constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa ister Arraylist yazin isterseniz List yazin ikiside calisir
        //Detaylari Collections konusunda gorecegiz

        //Ornek: Bir integer List olusturun ve 12 elemanini  Listden siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);


        //1 . yol
//        Integer nonPrimitive =12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2. yol
        ages.remove((Integer) 12);
        System.out.println(ages);

        //3. yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        //4. yol
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);



        //Bir ArrayList teki elemanin tum gorunumlerini nasil sileriz
        List<String>citiesToRemove= new ArrayList<>();
        citiesToRemove.add("Yozgat");
        citiesToRemove.add("Istanbul");


        cities.removeAll(citiesToRemove);
        System.out.println(cities);



    }
}
