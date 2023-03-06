import java.util.Scanner;

public class buyukKucuk {

    public static void main(String[] args) {


        int[] dizi = {34, 21, 54, 65, 12};
        azalanSiralama(dizi);


    }

    static void azalanSiralama(int[] dizi) {
        int gecici = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length - 1; j++) {
                if (dizi[j - 1] < dizi[j]) {
                    gecici = dizi[j - 1];
                    dizi[j - 1] = dizi[j];
                    dizi[j] = gecici;
                }
            }

        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+ " ");

        }
    }
}
