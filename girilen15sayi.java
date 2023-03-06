import java.util.Scanner;
import java.lang.Math;

public class girilen15sayi {
    public static void main(String[] args) {
        double toplam = 0;


        for (int gs = 1; gs <= 15; gs += 1) {
            Scanner sc = new Scanner(System.in);
            String str1 = String.format("%d. sayıyı giriniz ", gs);
            System.out.println(str1);
            double sayi = sc.nextInt();
            sayi = Math.pow(sayi, 3);
            toplam = sayi + toplam;


        }
        System.out.print("Cevap: ");
        System.out.println(toplam);
    }
}

