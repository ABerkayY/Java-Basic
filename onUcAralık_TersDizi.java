import java.util.Arrays;

public class onUcAralık_TersDizi {
    public static void main(String[] args) {
        int[] dizi = {3,5,7,9,11,13,2,77};
tersDizi(dizi);
        System.out.println(Arrays.toString(dizi));
    }
    static void tersDizi(int[] dizi){
        int temp=0;
        for (int i = 0; i < dizi.length/2; i++) {
          temp = dizi[i];
          dizi[i] = dizi[dizi.length-1-i];
          dizi[dizi.length-1-i] = temp;



        }


    }
}
