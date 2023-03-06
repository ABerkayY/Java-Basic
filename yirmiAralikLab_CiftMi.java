import java.util.Scanner;
//GİRİLEN SAYININ HERHANGİ BİR BASAMAĞI TEKSE FALSE DEĞİLSE TRUE
public class yirmiAralikLab_CiftMi {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int n = sayi.nextInt();
        System.out.println(ciftMi(n));


    }

    static boolean ciftMi(int n) {
        if (n == 0)
            return true;
        while (n != 0) {
                if ((n%10)%2!=0)
                    return false;
                n/=10;

            }
            return true;

} }


