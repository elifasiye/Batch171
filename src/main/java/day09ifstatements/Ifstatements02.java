package day09ifstatements;

import java.util.Scanner;

public class Ifstatements02 {


    public static void main(String[] args) {
        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz...");

        int num = input. nextInt();

       /* if(num % 2 ==0){
            System.out.println("Cİft Sayidir");
        }

         if( num % 2 !=0){
             System.out.println("Tek Sayidir");
         }
     */

         //2.yol
        if(num%2==0){
            System.out.println("Cift sayidir");
        }else{
            System.out.println("Tek sayidir");

        }








    } }

