import java.util.Arrays;

public class yirmiAralikLab4 {
    public static void main(String[] args) {
        int [] dizi = {1,2,3,4,5,-5,0};
        int n = dizi.length;
        System.out.println("Verilen dizi"+ Arrays.toString(dizi));
        System.out.println("Verilen dizinin toplamı "+ rekursifDiziToplam(dizi,n));

    }

    static int rekursifDiziToplam(int[]dizi,int n){
        if(n==1){
            return dizi[0];
        }
        return (rekursifDiziToplam(dizi,n-1)+dizi[n-1]);

    }
}
