package Day06swapvaluesstringmanipulations;

public class TEKRAR {

    public static void main(String[] args) {

        String s = "Java is easy" ;

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz

 String sUpper= s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY


        //Ornek2: "s" Stringindeki tum characterleri kucuk harf yapiniz

        String sLower=s.toLowerCase();
        System.out.println(sLower);//java is easy


        //Ornek3:  "s" Stringindeki ilk characteri aliniz

        char sCharacter= s.charAt(0);
        System.out.println(sCharacter);


        //Ornek 4: "s" stringindeki bastan ikinci ve sondan ikinci characteri yazdirin

        char second = s.charAt(1);
        System.out.println(second);

        char secondLast =s.charAt(10);
        System.out.println(secondLast);

        System.out.println( "" + second + secondLast);





    }
}
