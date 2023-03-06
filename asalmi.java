import java.util.Scanner;

public class asalmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz ");
        int sayi = sc.nextInt();
        int kontrol = 1;

        for (int i = 2; i < sayi; i += 1) {
            if (sayi % i == 0) {
                kontrol = 0;
                break;

            } else {
                kontrol = 1;
            }

        }
        String asal = String.format("%d sayısı asal bir sayıdır. ", sayi);
        String asald = String.format("%d sayısı asal bir sayı DEĞİLDİR. ", sayi);
        if (kontrol == 1) {
            System.out.println(asal);


        } else {
            System.out.println(asald);
        }


    }


}

