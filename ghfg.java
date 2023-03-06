import java.util.Scanner;

public class ghfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı gir");
        int sayi = sc.nextInt();
        System.out.println(reküAsal(sayi));


    }
    static boolean reküAsal(int sayi){
        boolean kontrol = true;
        for (int i = 2; i < sayi; i += 1) {
            if (sayi % i == 0) {
                kontrol = false;
                break;

            } else {
                kontrol = true;
            }

        }
    return kontrol;}
}
