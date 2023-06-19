package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
  /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri
        Erkek, 65 yas ve uzeri emekli olabilir
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak icin ... yil daha calisman gerekir"yazdirin
         */

        //Once yas veya cinsiyetten birini ana degisken secip ona gore bir degisken olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz, \nKadin icin : K, Erkek icin E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas < 10 || yas > 80) { //1.bolge
            System.out.println("Gecersiz yas girisi");

        } else if (yas < 60) {//2.bolge

            if (cinsiyet != 'E' && cinsiyet != 'K') {
                System.out.println("Cinsiyet girisi hatali");
            } else if (cinsiyet == 'K') {
                System.out.println("Kadin 60 yasina kadar calismalidir, daha " + (60 - yas) + "sene calismalidir");
            } else {
                System.out.println("Erkek 65 yasina kadar calismalidir, daha " + (65 - yas) + "sene calismalidir");
            }
        } else if (yas < 65) {
            if (cinsiyet != 'E' && cinsiyet != 'K') {
                System.out.println("Cinsiyet girisi hatali");
            } else if (cinsiyet == 'K') {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Erkek 65 yasina kadar calismalidir, daha " + (65 - yas) + "sene calismalidir");
            }
        } else { //4.bolge
            if (cinsiyet != 'E' && cinsiyet != 'K') {
                System.out.println("Cinsiyet girisi hatali");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }
    }
}