package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {


        //Kalibini olusturalim

      /*  for (baslabgic degeri   ;  loop calisma kurali  ; artirma/azaltma ; ){
            calisacak kodlar
        }

       */


      /* While calisma kalibi
        baslangic degeri
        while(loop calisma kurali){
        calisacak kodlar
        artirma/azaltma
        }
       */

        //Ornek 1 : 3 ten 6 ya kadar tam sayilari console a yazdiriniz
        //1.yol : for loop
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2.yol
        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();


        //Ornek 2 : 23 ten 12 ye kadar cift sayilari console a yazdiriniz

        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;

        }

        System.out.println();

        // Ornek 3 : 6 dan 19 a kadr tum tek sayilari consol e yazdiriniz

        int m = 6;

        while (m<20){

            if (m%2!=0){
                System.out.print(m+" ");
            }

            m++;
        }








    }
}
