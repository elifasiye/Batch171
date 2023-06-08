package day03methodobjectcreationscanner;

public class MethodCreation01 {


    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup=" + kup);

        print("java is easy");
    }

    //Ornek 1 : Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.

    static double getCube(double a) {

        return a * a * a;
    }

    //Note : Access modiifer i default yapmak istersen access modifieri  YAZMAYINIZ


    //Ornek 2 : girilem bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void  print(String str){
        System.out.println(str);













    }


}
