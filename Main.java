import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dizi[] = {1, 2, 5, 4,4,7,1,8,5,2};
        int dizi1[] = {9,54,37,47,578,578,9,47};

        elemanTekrar(dizi1);



        //DİZİNİN TEKRARLAYAN ELEMANLARINI BULMA
        /*
        int[] dizi = {1,2,2,3,4,6,7,5,6,5};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[i] == dizi[j])
                    System.out.println(dizi[i]+ "");



            }


        }*/










        /*10 ELEMANLI DİZİNİN ARİTMETİK ORTALAMASI

        int [] dizi = new int[10];
        float top=0;
        for (int i = 0;i < dizi.length; i++) {
            dizi[i]= (int)(Math.random()*100+1);
            top+=dizi[i];
            System.out.println(dizi[i]+" ");

        }
        System.out.println("\nAritmetik ortalama: "+top/dizi.length);*/


        /*GİRİLEN 5 SAYILIK DİZİNİN EN BÜYÜK VE EN KÜÇÜĞÜNÜ YAZDIRAN ŞEY
        int []dizi = new int[5];
        Scanner giris = new Scanner(System.in);
        System.out.println("5 adet sayı giriniz. ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= giris.nextInt();


        }
        giris.close();
        int kucuk=dizi[0];
        int buyuk=dizi[0];
        for (int j = 0; j < dizi.length; j++) {
            if (dizi[j]>buyuk)
                buyuk = dizi[j];
            if (dizi[j]<kucuk)
                kucuk = dizi[j];


        }
        System.out.println("En büyük eleman: "+buyuk+"\nEn küçük eleman: "+kucuk);*/






        /*int ct = 1;
        int tt = 1;

        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {
                ct = ct * i;

            } else {
                tt = tt * i;

            }


        }
        System.out.println(tt);
        System.out.println(ct);*/
        //1DEN 10A YILDIZ ŞEKLİNDE YAZDIRAN ŞEY
        /*for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);


            }
            System.out.println();
        }*/


        //SAYININ TAM BÖLENLERİNİ BULAN ŞEY
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Bölenlerini istediğiniz sayıyı giriniz: ");
        int sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }

        }*/





        /*int i = 0;
        int ct = 0;
        int tt = 0;
        while (i <= 90) {
            if (i % 2 == 0) {
                ct = ct + i;
                i++;
            } else {
                tt = tt + i;
                i++;
            }

        }
        System.out.println(ct);
        System.out.println(tt);*/
        //1 DEN 90 A KADAR ÇİFT VE TEK SAYILARIN TOPLAMI
        /*int ct = 0;
        int tt = 0;

        for (int i = 1; i <= 90; i++) {
            if (i % 2 == 0) {
                ct = ct + i;

            } else {
                tt = tt + i;

            }
        }
        System.out.println(ct);
        System.out.println(tt);*/





       /* char islem = '+';
        int is = (int) (Math.random() * 101);
        int iks = (int) (Math.random() * 101);*/


       /* switch (islem = '+') {
            case 1:
                int cvp = is + iks;
                break;

            case 2:
                int cvp = is - iks;
                break;
            case 3:
                int cvp = is + iks;
                break;
            case 4:
                int cvp = is + iks;
                break;*/


        //Girilen iki kelimeyi kıyaslayan şey
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk kelimeyi giriniz ");
        String ilk = sc.next();
        String i1= ilk;
        ilk.toLowerCase();
        System.out.println("İkinci kelimeyi giriniz ");
        String ikk = sc.next();
        String i2= ikk;
        ikk.toLowerCase();

        String str1 = String.format("%s kelimesi ile %s kelimesi eş kelimelerdir.",i1,i2);
        String str2 = String.format("%s kelimesi ile %s kelimesi eş kelimeler değillerdir.",i1,i2);
        if (ilk.equals(ikk))
            System.out.println(str1);
        else
            System.out.println(str2);*/


        //Vize ve final notu hesaplayıp harf notu olarak göster
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Vize giriniz ");
        int vizenot = sc.nextInt();
        System.out.println("Final giriniz ");
        int finnot = sc.nextInt();
        int nn = (vizenot*40/100)+(finnot*60/100);
        if (nn <=100 && nn>=80)
            System.out.println("Harf notunuz: AA");
        else if (nn <80 && nn>=65)
            System.out.println("Harf notunuz: BB");
        else if (nn <65 && nn>=50)
            System.out.println("Harf notunuz: CC");
        else if (nn <50 && nn>=0)
            System.out.println("Harf notunuz: DD");
        else
            System.out.println("Hatalı değer");*/


        //tekse küp çiftse kare
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz ");
        int sayi = sc.nextInt();
        if (sayi%2 ==0)
            sayi = (int)(Math.pow(sayi,2));
        else
            sayi = (int)(Math.pow(sayi,3));
        System.out.println(sayi);*/


        //n e kadar sayıları yazdıran kod
       /* for (int i = 1; i <= 5; i += 1) {
            System.out.println(i);*/

        // Rastgele sayı üret tek mi çift mi sorgula
        /*Random sa = new Random();
        int num = sa.nextInt(101);
        String str1 = String.format("%d sayısı tek bir sayıdır. ", num);
        String str2 = String.format("%d sayısı çift bir sayıdır.", num);

        int tk = num % 2;
        if (tk == 0)
            System.out.println(str2);
        else
            System.out.println(str1);*/
        // Rastgele bir sayı oluşturup negatif mi pozitif mi bak
        /*int rs = (int) (Math.random() * 101 - 50);
        String str1 = String.format("%d sayısı pozitif bir sayıdır. ", rs);
        String str2 = String.format("%d sayısı negatif bir sayıdır.", rs);
        String str3 = String.format("%d sayısı sıfırdır.", rs);

        if (rs > 0)
            System.out.println(str1);
        else if (rs < 0)
            System.out.println(str2);
        else
            System.out.println(str3);*/


    }

    static void elemanTekrar(int[] dizi) {
String elemanlar="";

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    String deger = Integer.toString(dizi[i]);
                    if (!elemanlar.contains(deger))
                        elemanlar += deger;


                }


            }
        }
        for (int i = 0; i <elemanlar.length() ; i++) {
            System.out.print(elemanlar.charAt(i)+" ");

        }
    }
}


