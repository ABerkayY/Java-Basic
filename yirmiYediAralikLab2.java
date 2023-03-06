import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class yirmiYediAralikLab2 {
    public static void main(String[] args) {
        ArrayList<Integer> sayiDizisi = new ArrayList<Integer>();
        Scanner sc = new  Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        sayiDizisi.add(sc.nextInt());

        while (true){
            System.out.println("Sayı eklemek için = 'e',Çıkmak için = 'h'");
            String cevap = sc.next();
            cevap.toLowerCase();
            char c = cevap.charAt(0);
            if (c=='e'){
                System.out.println("Yeni sayı giriniz.");
                sayiDizisi.add(sc.nextInt());
            } else if (c=='h') {
                break;

            }
            else
                System.out.println("Geçersiz giriş!");
        }
        System.out.println("Orijinal liste:"+sayiDizisi);

        Collections.sort(sayiDizisi);
        System.out.println("Sıralanmış dizi: "+sayiDizisi);
        int ortanca = sayiDizisi.size()/2;
        System.out.println("Ortanca eleman: "+sayiDizisi.get(ortanca));

    }
}
