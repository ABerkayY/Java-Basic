import java.util.Arrays;
//KÜÇÜKTEN BÜYÜĞE SIRALAMA
public class sortAlistirma {
    public static void main(String[] args) {
        int []dizi ={45,7,31,754,83,513,35,4,78,87,2757,3};
        for (int i = 0; i <= dizi.length; i++) {
            for (int j = 1; j <= dizi.length-1; j++) {
                if (dizi[j-1]>dizi[j])
                {int temp;
                     temp = dizi[j-1];
                    dizi[j-1] =dizi[j];
                    dizi[j] = temp;

                }

            }
        }

        System.out.println(Arrays.toString(dizi));
    }
}
