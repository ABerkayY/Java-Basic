import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary e çevirmek istediğiniz sayıyı giriniz: ");
        int sayi = sc.nextInt();
        int sayi2 = sayi;
        int kalan = 0;
        int bölüm = 1;
        ArrayList<Integer> liste = new ArrayList<Integer>();
        while (bölüm >= 1) {
            kalan = sayi % 2;
            liste.add(kalan);
            bölüm = sayi / 2;
            sayi = bölüm;

        }
        Collections.reverse(liste);
        String cvp = String.format("%d sayısının binary hali:%s ", sayi2, liste);
        System.out.println(cvp);

    }
}
