package day05_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        //Soru 5: Kullanicidan notunu alin
        //        50 ve daha buyukse "Sinifi Gectin"
        //        50'den kucukse "Malesef kaldin" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not= scanner.nextDouble();
        if (not>=50){
            System.out.println("Sinifi Gectin");
        }
        if (not<50){
            System.out.println("Malesef kaldin");
        }
        /*
        Onceki sorulardan farkli olarak bu soruda iki if birbirine bagimlidir
        Iki if'den sadece 1'i calisir
        Ikisinin birden calisma ihtimali yoktur
        Ikisinin de calismama ihtimali de yoktur

         */
        if (not>=50){
            System.out.println("Sinifi Gectin");
        }else {
            System.out.println("Malesef kaldin");
        }
        /*
        if ve else body"leri tek bir boolean sarta bagimlidir
        iki if'den sadece 1'i calisir
        Ikisinin birden calisma ihtimali yoktur
        Ikisinin calismama ihtimali de yoktur
         */




    }

}
