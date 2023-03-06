import java.util.Scanner;

public class sinavsoru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi 1");
        int sayi1 = sc.nextByte();
        System.out.println("sayi 2");
        int sayi2 = sc.nextByte();
        System.out.println("Sayıların obebi"+" "+obeb(sayi1,sayi2));


    }
    static int obeb (int sayi1,int sayi2){
        int buyuk;int kucuk;int ob = 0;
        if(sayi1>sayi2){
            buyuk = sayi1;kucuk = sayi2;}
            else{
            buyuk =sayi2;kucuk = sayi1;}
        for (int i = 1; i <= kucuk; i++) {
            if(sayi1%i==0&&sayi2%i==0){
                ob = i;
            }
        }
        return ob;
    }
}
