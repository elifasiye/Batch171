package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Ornek: kullanicidan adresini alın ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz:");

        String adress = input.nextLine();
        System.out.println(adress);


    }

}
