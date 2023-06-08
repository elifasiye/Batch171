package day05concatinationopertorstypecasting;

public class TypeCasting {

        /*Numeric primitive type larinin birbirine donusturulmesine "Type Casting (tip dönüştürme)" denir
        Numeric (sayisal) Data Typelar: byte - int - long - float- double
         */
        //kucukten buyuge data typeleri su sekildedir: byte - int - long - float- double
        //Note 1 : Kucuk data type larini buyuk data type larina cevirmeyi java otomatik olarak yapar
        // bu isleme "AutoWidening" (otomatik genisletme) denir

         //Note 2 : Buyuk data typelerini kucuk data typelarina donusturmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
        //Bu isleme "ExplicitNorrowing"(Acıktan daraltma) denir


    public static void main(String[] args) {

        //byte data type ni int data type ina ceviriniz

        byte age=13;
        int ageInt=age;//AutoWidening
        System.out.println(ageInt);

        // int data type ini short data type ina ceviriniz
        int weight=312;
        short weightShort=(short)weight;

        System.out.println(weightShort);//Explicit Norrowing


        // int data type ini float data typ ina ceviriniz

        int population=5000;
        System.out.println(population);

        float populationFloat=population;
        System.out.println(populationFloat);


        //double data type ini short data type ina ceviriniz

        double number=15.5;
        System.out.println(number);
        short numberShort=(short)number;
        System.out.println(numberShort);

        //Example

        short num=260;
        System.out.println(num);

        byte numByte=(byte)num;
        System.out.println(numByte);

        //NOTE: donusum yaptigimiz sayi(260) donustureceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar
        //ve mod isleminin sonucu sizin yeni degeriniz olur



    }
}
