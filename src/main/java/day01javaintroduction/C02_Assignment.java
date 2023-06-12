package day01javaintroduction;

public class C02_Assignment {
    public static void main(String[] args) {
        int sayi;

        //Java deger atanmadan bir variable olusturulmasina izin verir,ama deger atanmadan kullanmaya izin vermez
        System.out.println("sayi"); //sayi

        sayi=20;
        System.out.println(sayi);//20

        sayi= sayi+10;

        System.out.println(sayi);//30

        //sayi +10 =sayi;
        //Java'da esitligin sol tarafi variabledir ve sol tarafta islem olmaz
        //Esitligin sag tarafi ise degerdir, burada islemler olabilir
        //Java = gordugunde once esitligin sagini hesaplar
        //Sonra sag tarafta buldugu degeri, soldaki variable'a atama yapar

        sayi=2*sayi;
        System.out.println(sayi);//60

        //int sayi=50;
        //Data turu yukarida tanimlanmisti
        //Java olusturulan bir variable'in data turunun degistirilmesine IZIN VERMEZ
        //Onun icin data turu sadece 1 kere yazilabilir




    }
}

/*
Java'da bir kodun alti kirmizi cizili ise orada Compile Time Error (CTE) vardir.

Eger projenin herhangi bir yerinde CTE varsa o projedeki hicbir class calismaz

 ve " " (cift tirnak icine) ne yazarsaniz oraya yazdiginiz sekilde consolde yazdirilir

Eger bir varaiable'in o satirdaki degerini yazdirmak isterseniz sout icerisine Variable Name i yazmaniz yeterlidir.
 */