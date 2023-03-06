import java.util.Scanner;

public class onUcAralık_İkiliMatris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaça kaç matris istiyorsunuz? ");
        int sayi = sc.nextInt();
        matris(sayi);

    }

    static void matris(int sayi) {

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
                System.out.print((int) (Math.random() * 2) + " ");

            }
            System.out.println();
        }


    }
}
