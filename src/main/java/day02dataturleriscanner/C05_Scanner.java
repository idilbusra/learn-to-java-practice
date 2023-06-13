package day02dataturleriscanner;

import java.util.Locale;
import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini isteyip
        //ismi buyuk harfe cevirip kaydedin
        //sonra kuulaniciya yeni halini yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ismini giriniz");
        String girilenIsim =scanner.nextLine();
        //nextLine() yazilan bilginin tumunu getirir
        //next() ilk space'e kadar olan kismini getirir  H Ibrahim==> H

        girilenIsim =girilenIsim.toUpperCase();
        System.out.println("Girilen ismin duzenlnmis hali : "+girilenIsim);
    }
}
