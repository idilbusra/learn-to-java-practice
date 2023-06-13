package day02dataturleriscanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini,soyismini ve yasini alip,asagidaki formatta yazdirin
        //Isminiz : John
        //Soyisminiz: Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen sirasiyla isminizi,soyisminizi ve yasinizi giriniz");

        String isim =scanner.nextLine();
        String soyIsim= scanner.nextLine().toUpperCase();
        int yas= scanner.nextInt();

        /*
        System.out.println("Isminiz : "+isim);
        System.out.println("SoyIsminiz : "+soyIsim);
        System.out.println("Yasiniz : "+yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir. ");

         */

        System.out.println("Isminiz : "+isim+"\nSoyIsminiz : "+soyIsim+"\nYasiniz : "+yas+"\nKaydiniz basariyla tamamlanmistir. " );






    }
}
