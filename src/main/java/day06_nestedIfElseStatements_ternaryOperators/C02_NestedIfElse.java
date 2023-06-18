package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri
        Erkek, 65 yas ve uzeri emekli olabilir
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        veya "Emekkli olmak icin ... yil daha calisman gerekir"yazdirin
         */

        //Once yas veya cinsiyetten birini ana degisken secip ona gore bir degisken olsun

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz, \nKadin icin : K, Erkek icin E" );

        char cinsiyet =scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();









    }
}
