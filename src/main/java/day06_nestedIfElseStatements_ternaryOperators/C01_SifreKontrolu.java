package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi girmesini isteyin
        Sayi asagidaki 4 sarti sagliyorsa "Mukemmel Sayi"yazdirin

        Saglanmayan sartlarin tamamini kullaniciya soyleyin

        1) Sayi 4 basamakli olmalidir
        2) Sayi 3 ile bolunmelidir
        3) Sayi 5 ile bolunmemelidir
        4) Sayinin birler basamagi tek sayi olmalidir

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        boolean sayiMukemmelMi=true;

        //1-Sayi 4 basamakli olmalidir
        if(sayi<1000 || sayi>9999){
            System.out.println("Sayi 4 basamakli olmalidir");
            sayiMukemmelMi=false;
        }

        // 2) Sayi 3 ile bolunmelidir
        if(sayi%3!=0){
            System.out.println("Sayi 3 ile bolunmelidir");
            sayiMukemmelMi=false;
        }

        // 3) Sayi 5 ile bolunmemelidir
        if(sayi%5!=0){
            System.out.println("Sayi 5 ile bolunmelidir");
            sayiMukemmelMi=false;
        }

        //4) Sayinin birler basamagi tek sayi olmalidir
        if((sayi%10)%2==0){
            System.out.println("Sayinin birler basamagi tek sayi olmalidir");
            sayiMukemmelMi=false;
        }

        if(sayiMukemmelMi){
            System.out.println("Mukemmel Sayi");
        }












    }
}
