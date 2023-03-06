import java.util.Scanner;

public class mete {
    public static void main(String[] args) {
        System.out.println("Matematik işlem uygulamasına hoşgeldiniz!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Başlamak için 'e' tuşuna basınız.");
        String bs = sc.nextLine();
        bs.toLowerCase();
        int durum = (int)(Math.random()*4);

        if (bs.equals("e") ){
           long baslangic = System.currentTimeMillis();
           islem(durum);
            System.out.println("Geçen zaman: " + zaman(baslangic));

        }

    }
    static int islem(int durum){
        int soru =0;
        Scanner sc = new Scanner(System.in);
        int s1 = (int)(Math.random()*100+1);
        int s2 = (int)(Math.random()*100+1);
        int s3 = (int)(Math.random()*100+1);
        if (durum==0){
                soru = s1+s2/s3;
                System.out.println(s1+s2/s3 + "cevap = ");

            int cvp = sc.nextInt();
                }

       else if (durum==1) {
            soru = s1 * s2 - s3;
            System.out.println(s1 * s2 - s3 + "cevap = ");
            int cvp = sc.nextInt();
        }
        else if (durum==2) {
            soru = s1 * s2 * s3;
            System.out.println(s1 * s2 * s3 + "cevap = ");
            int cvp = sc.nextInt();
        }
            else if (durum==3) {
                soru = s1+s2+s3;
                System.out.println(s1+s2+s3 + "cevap = ");
            int cvp = sc.nextInt();

        }

return soru;
    }
    static long zaman(long baslangic){
        long bitis = System.currentTimeMillis();
        return (bitis-baslangic)/1000;

    }
}
