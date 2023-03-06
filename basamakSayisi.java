import java.util.Scanner;

public class basamakSayisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz ");
        int sayi = sc.nextInt();
        if (sayi < 10 && sayi > 0) {
            System.out.println("Basamak sayısı 1'dir.");
        } else {
            int sayi1 = sayi;
            int kalan = sayi % 10;
            sayi = sayi - kalan;
            int baso = 0;

            for (int basamaks = 10; sayi > 0; basamaks += 1) {
                sayi = sayi / 10;
                baso += 1;

            }
            String str1 = String.format("%d sayısının basamak sayısı: %d ", sayi1, baso);
            System.out.println(str1);
        }


    }
}
