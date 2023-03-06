import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        int sayac = 2;
        int kontrol = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz ");
        int sayi = sc.nextInt();
        for (int i = 1; i <= sayi;i+=1){
            if (sayi%i == 0){
                kontrol=0;
                break;
            }
        }
        /*while (sayac <= sayi) {
            if (sayi % sayac == 0) {
                kontrol = 0;
                break;
            } else {
                sayac += 1;
                break;*/
        if (kontrol == 1) {
            System.out.println("Asal bir sayıdır.");
        } else {
            System.out.println("Asal bir sayı değildir.");
        }
            }
        }





