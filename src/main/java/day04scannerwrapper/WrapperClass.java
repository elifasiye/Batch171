package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive: char      - boolean - byte - short - int     - long  -  float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long  -  Float - Double


        //Wrapper classlar non-primitive dir o yuzden memory de cok yer kaplarlar
        //dolayisi ile sart degilse Wrapper Class kullanmayi tercih etmeyiz.

        //n. yazarsan hic method goremezsin cunku primitivler method icermez

        int n = 12;

        // m. yazarsan eger bir cok method gorebilirsin cunku wrapper class lar method ıcerir
        Integer m = 12;

        byte t = 10;
        Byte k = 13;


        //Ornek1: short data type inin min ve max degerlerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort=" + minShort);

//Ornek2: int data type inin min edgeri ile byte data type inin max degerinin toplamini bulunuz

        int intMin = Integer.MIN_VALUE;

        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin + byteMax);//-2147483521


        //Ornek3: Primitive int i wrapper Integer a ceviriniz (Autoboxing)
        int num = 12;
        Integer WrapperNum = num;


        //Ornek4 : Wrapper Byte i primitive byt a ceviriniz (Unboxing)

        Byte l = 13;
        byte primitive = l;

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz (Auto Boxing)

        char initial = 'm';
        Character initialWrapper = initial;


//Ornek 6 : Wrapper Boolean i primitive boolean a ceviriniz(UnBoxing)



        Boolean isOldWrapper = true;
        boolean isOlPrimitive =isOldWrapper;















    }
}
