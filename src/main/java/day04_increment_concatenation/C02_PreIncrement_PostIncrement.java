package day04_increment_concatenation;

import java.util.Scanner;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin
        //Girilen tam sayiyi yazdirip
        //Sonra 1 arttirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        System.out.println("Girilen sayi : "+ girilenSayi++  );

        //Kullanicidan bir sayi daha alin
        //Bu sayiyi once arttirin
        //sonra yazdirin

        System.out.println("Lutfen bir tam sayi daha girin");

        int girilenSayi2= scanner.nextInt();
        System.out.println("Girilen sayi2 : "+ ++girilenSayi2 );
        System.out.println("Kodun sonunda GS : " +girilenSayi+ ", GS2 : " + girilenSayi2 );


    }








}
