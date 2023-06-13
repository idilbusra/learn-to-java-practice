package day02dataturleriscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin
        //girilen sayinin iki katini yazdirin

        //1-Scanner objesi olusturmak
        Scanner scanner = new Scanner(System.in);

        //2-Kullanicidan ne istedigimizi soyleyin
        System.out.println("Lutfen bir tamsayi giriniz");

        //3- Kullanicinin girecegi data turune uygun bir variable olusturun
        //Scanner objesi ile variableá uygun hazir methodú kullanip
        //Kullanicidan degeri alin ve olusturdugumuz variable'a atayin

        int girilenSayi =scanner.nextInt();

        System.out.println("Girdiginiz sayinin iki kati: " + 2*girilenSayi);



    }
}
