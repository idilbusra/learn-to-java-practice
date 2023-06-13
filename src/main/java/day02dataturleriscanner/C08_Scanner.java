package day02dataturleriscanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini,soyismini ve yasini alip
        //asagidaki formatta yazdirin
        //girilen bilgiler : J DOE, 44

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminizi,soyisminizi ve yasinizi giriniz");
        char isimIlkHarf = scanner.nextLine().toUpperCase().charAt(0);
        String soyIsim= scanner.nextLine().toUpperCase();
        int yas =scanner.nextInt();

        System.out.println("Girilen bilgiler : "+ isimIlkHarf + " " +
                soyIsim+", "+ yas);

    }
}
