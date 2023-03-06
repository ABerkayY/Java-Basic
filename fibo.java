import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {


        int fibon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaça kadar olan sayıların Fibonacci dizisini istiyorsunuz?");
        int sayi = sc.nextInt();


        for (int x = 1; x <= sayi; x += 1) {
            fibon = x + fibon;


        }
        String str1 = String.format("%d sayısına kadar olan sayıların Fibonacci toplamı: %d ", sayi, fibon);
        System.out.println(str1);


       /* String fibonc = String.format("%d fibonaccisi", fibon);
        System.out.println(fibonc);*/

    }

}



