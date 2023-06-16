package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        //Verilen bir sayinin 2,3,5,7,11 ve 23 sayilarindan kac tanesine
        //Kalansiz olarak bolunebildigini yazdirin

        //Ornegin kullanici 30 dediginde output : 3

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi=scanner.nextInt();

        int sayac=0;

        if(girilenSayi%3==0){
            sayac++;
        }
        if(girilenSayi%5==0){
            sayac++;
        }
        if(girilenSayi%7==0){
            sayac++;
        }
        if(girilenSayi%11==0){
            sayac++;
        }
        if(girilenSayi%23==0){
            sayac++;
        }
        System.out.println("Girilen sayi, istenen sayilardan "+ sayac+" tanesine tam bolunebiliyor. ");


    }
}
