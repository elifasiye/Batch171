package day14loops;

public class Loops02 {
    public static void main(String[] args) {

        //Ornek 1 : 5 ten 8 e kadar tam sayilarin toplamini veren kodu yaziniz
        // 5+6+7+8 ==>26

        int sum =0;

        for (int i = 5 ; i<9 ; i++){
            sum=sum+i;
        }
        System.out.println(sum);



        //Ornek  2 : 7 den 9 a kadar tam sayilarin carpimini yazdirin
        //7*8*9=504

        int multiply=1;

        for (int i = 7 ; i<10; i++){
            multiply=multiply*i;
        }

        System.out.println(multiply);


        //Ornek 3 : Verilen bir tam sayinin rakamlarinin toplamini veren kodu yaziniz
        // 578 ==> 5 + 7 + 8 ==>20


        int toplam = 0 ;
        for (int i = 578  ;   i>0 ;  i =i/10){
            toplam =toplam + i % 10;
        }
        System.out.println(toplam);







    }
}
