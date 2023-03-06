import java.util.Scanner;

public class yirmiYediAralıkUygulamaSınavı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        //TersCevir(sayi);
        Ters(sayi);

    }
    /*static int TersCevir(int sayi) {


        System.out.print("Girdiğiniz sayinin tersten yazılışı = ");
        while (sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;
        }
        return sayi;
    }*/
    static int Ters(int sayi){
        int kalan =0;
        int yeniSayi=0;

        while (sayi > 0){
            kalan = sayi%10;
            sayi = (sayi-kalan)/10;
            yeniSayi= yeniSayi*10+kalan;

        }
        System.out.println(yeniSayi);
        return yeniSayi;
    }
}
