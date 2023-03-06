import java.util.Scanner;

public class palidrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz ");
        int sayi = sc.nextInt();

        while (sayi < 10) {

            System.out.println("10'dan büyük bir sayı giriniz ");
            sayi = sc.nextInt();

        }


        int gsayi = sayi;
        int ysayi = 0;
        for (int bisi = 0; gsayi > 0; bisi++) {

            int kalan = gsayi % 10;
            gsayi = (gsayi - kalan) / 10;
            ysayi = ysayi * 10 + kalan;

        }
        String pali = String.format("%d sayısı bir palidrom sayıdır. ", sayi);
        String palid = String.format("%d sayısı bir palidrom sayısı DEĞİLDİR. ", sayi);

        if (ysayi == sayi) {
            System.out.println(pali);
        } else {
            System.out.println(palid);
        }


    }
}
