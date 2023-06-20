package day07_switchStatements_StringManipulations;

import java.util.Scanner;

public class C04_SwitchStatements {
    public static void main(String[] args) {
        //Soru: Kullanicidan iki basamakli bir sayi alip, rakami yaziyla yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yaziyla goruntulemek istediginiz iki basamakli tam sayiyi giriniz");
        int girilenSayi = scanner.nextInt();
        if (girilenSayi < -99 || girilenSayi > -10 && girilenSayi < 10 || girilenSayi > 100)
            System.out.println("Iki basamakli bir tane sayi girmediniz");
        else {
            if (girilenSayi < 0) {
                System.out.println("Eksi");
                girilenSayi *= -1;
            }
        }
        switch (girilenSayi / 10) {
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kirk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmis");
                break;
            case 7:
                System.out.println("yetmis");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
        }
        switch (girilenSayi % 10) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }
    }
}

