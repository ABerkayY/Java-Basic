import java.util.Arrays;

public class uygulamaOnucAralık {
    public static void main(String[] args) {
        int[] dizi = {34, 21, 54, 65, 12};
        azalanSiralama(dizi);
        System.out.println(Arrays.toString(dizi));
    }

    static void azalanSiralama(int[] dizi) {
        int gecici;
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 1; j < dizi.length - 1; j++) {
                if (dizi[j - 1] < dizi[j]) {
                    gecici = dizi[j - 1];
                    dizi[j - 1] = dizi[j];
                    dizi[j] = gecici;
                }
                }
        }
    }
}


