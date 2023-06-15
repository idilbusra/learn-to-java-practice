package day05_ifElseStatements;

public class C01_BasitIfStatements {
    public static void main(String[] args) {

        //Bagimsiz if cumleleri kodun geriye kalani ile ilgilenmez
        //Sarta odaklanir, sart true ise body calisir, false ise body calismaz
        //Birden fazla bagimsiz If Statemenets varsa
        //degerlere bagli olarak tum If Body'leri calisabilecegi gibi
        //Hicbir If Body'sinin calismamasi da mumkundur

        int a =20;
        int b= 75;

        if (a>b){
            System.out.println("a b'den buyuk ");
        }
        if (a%7 ==0){
            System.out.println("a 7'ye tam olarak bolunur ");
        }
        if (a%5 ==0){
            System.out.println("b 5'e tam olarak bolunur");
        }
        if (a+b > 100){
            System.out.println("Sayilarin toplami 100'den buyuk");
        }
        /*
        Eger If sartindan sonra {} kullanmazsak
        Java ilk ;'e kadar olan kismi If Body olarak kabul eder, sonraki siniflarla ilgilenmez

         Eger if sartini yazdigimiz ()'den hemen sonra ; yazarsak
         If Statement ;'de biter bu sarta bagli hic kod olmaz

         */
        if (b > 0){
            System.out.println("b sifirdan buyuk ");
            System.out.println("b gercekten sifirdan buyuk ");
            System.out.println("Valla b 0'dan buyuk");

        }

        boolean c=a+10> b-5 ; //31> -80 true

        if(c){
            System.out.println("Ozel sart saglandi");
        }
        if (true){
            System.out.println("Bu yazi her zaman yazdirilir, cunku sart hep true");
        }
        if(false){
            System.out.println("Bu kod hic calismaz");
        }



    }
}
