package Day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //Swap yer degistirmek demektir 1.kap domates  2. kap patates ==> swap==>1. kap patates 2.kap domates


        int a = 12;
        int b = 5; //Swap den sonra ==> a=5 ve b=12 ;
        int temp = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //1.Adim
        temp =a;
        //2.Adim
        a=b;
        //3.Adim
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.YOL

        int elma=12;
        int armut=5;
        System.out.println("elma= " + elma);
        System.out.println("armut= " +armut);

        elma =elma+armut;
        armut=elma-armut;
        elma=elma-armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
    }
}
