package day05_ifElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //Soru 2: Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin
        //No: Buyuk harf, kucuk harf hassasiyeti olmasin
        //Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini giriniz");

        char ilkHarf=scanner.next().toUpperCase().charAt(0);

        if(ilkHarf=='o' || ilkHarf=='O'){
            System.out.println("Ocak");
        }
        if(ilkHarf=='s' || ilkHarf=='S'){
            System.out.println("Subat");
        }
        if(ilkHarf=='m' || ilkHarf=='M'){
            System.out.println("Mart veya Mayis");
        }
        if(ilkHarf=='n' || ilkHarf=='N'){
            System.out.println("Nisan");
        }
        if(ilkHarf=='h' || ilkHarf=='H'){
            System.out.println("Haziran");
        }
        if(ilkHarf=='a' || ilkHarf=='A'){
            System.out.println("Agustos veya Aralik");
        }
        if(ilkHarf=='e' || ilkHarf=='E'){
            System.out.println("Eylul veya Ekim");
        }
        if(ilkHarf=='k' || ilkHarf=='K'){
            System.out.println("Kasim");
        }
        if(ilkHarf=='t' || ilkHarf=='T'){
            System.out.println("Temmuz");
        }




    }











}
