package day16arraysforeachloop;

import java.util.Arrays;

public class TEKRAR {
    public static void main(String[] args) {

        //ARRAYS01 TEKRAR :
    //Ornek 1 :
        String stdNames [] =new String[5];
        stdNames[0]="2";
        stdNames[1]="6";
        stdNames[2]="3";
        stdNames[3]="7";
        stdNames[4]="9";

        System.out.println(Arrays.toString(stdNames));


        //Ornek 2 : Array daki her elemanin sonuna '!' isareti koyarak yazdiriniz.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i]+"!");
        }







    }
}
