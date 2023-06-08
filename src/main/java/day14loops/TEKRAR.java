package day14loops;

public class TEKRAR {
    public static void main(String[] args) {

        //LOOPS01 TEKRAR
        //Ornek 1 : Verilen bir Stringi ters ceviren kodu yaziniz

        String t ="Java";
        String ters= "";

        for (int i = t.length()-1 ; i>=0 ; i--){
            ters =ters + t.substring(i,i+1);
        }
        System.out.println(ters);

        //2.YOL :
        String k = "Java";
        String ters2="";

        for (int i= t.length()-1 ; i>=0 ; i--){
            ters2 =ters2 + k.charAt(i);
        }

        System.out.println(ters2);



        //Ornek 2 :  Size verilen bir String in "Palindrome " olup olmadigini kontrol eden kodu yaziniz
        // nalan,   ey edip adanada pide ye ,  404

        String duz ="ey edip adanada pide ye";
        String ters3="";

        for (int i=duz.length()-1;i>=0;i--){
            ters3 = ters3 +duz.substring(i,i+1);
        }
        System.out.println(ters3);
        if (duz.equals(ters3)){
            System.out.println(duz+ " : Polindrome'dur. ");
        }else{
            System.out.println(duz+ " : Polindrome degildir");
        }



        System.out.println();




        //TEKRAR LOOPS02 :


        //Ornek 1 : 5 ten 8 e kadar tam sayilarin toplamini veren kodu yaziniz

        int sum =0;

        for (int i =5; i<9;i++){
            sum=sum+i;
        }
        System.out.println(sum);


        //Ornek  2 : 7 den 9 a kadar tam sayilarin carpimini yazdirin

        int multiply=1;
        for (int i =7; i<10;i++){
            multiply=multiply*i;
        }
        System.out.println(multiply);




        //Ornek 3 : Verilen bir tam sayinin rakamlarinin toplamini veren kodu yaziniz

        int toplam =0;














    }
}
