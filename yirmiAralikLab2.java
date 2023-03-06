import java.util.Scanner;
//GİRİLEN 2 SAYININ EBOBU
public class yirmiAralikLab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int s1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int s2 = sc.nextInt();
        System.out.println("Ebob="+ebob(s1,s2));
    }
    static int ebob(int s1,int s2){
        int ebob=1;
        int kucuk = s1;
        if (s2<s1)
            kucuk = s2;
        for (int i = 2; i <= kucuk ; i++) {
            if (s1%i==0 && s2%i==0)
                ebob = i;
        }

    return ebob;}
}
