package day03_dataCasting_Incement;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //Kullanicidan 3 basamakli pozitif bir tam sayi alin
        //sayinin rakamalar toplamini yazdirin
        //Ornegin 213 girildiginde 6 yazdirsin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen 3 basamaklı pozitif bir tamsayi giriniz");

        int sayi = scanner.nextInt();
        int birlerBas=0;
        int rakamlarToplami=0;

        birlerBas = sayi%10;//
        rakamlarToplami= rakamlarToplami+birlerBas;//

        //sayi 213 birlerBasamagi = 3 rakamlar toplami= 3
        sayi = sayi/10; //213/10 ==>21

        birlerBas=sayi%10;//21%10 ==>1
        rakamlarToplami=rakamlarToplami+birlerBas;//3+1=4

        sayi = sayi/10; //21/10 ==>2

        birlerBas=sayi%10;//2%10 ==>2
        rakamlarToplami=rakamlarToplami+birlerBas;//4+2=6

        System.out.println("Girilen sayinin rakamlar toplami : "+rakamlarToplami);












    }
}
