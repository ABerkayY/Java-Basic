import java.util.Arrays;
//DİZİNİN EN KÜÇÜK ELEMANI
public class yirmiAralikLab3 {
    public static void main(String[] args) {
        int [] dizi = {1,2,3,4,5,-5};
        int n = dizi.length;
        System.out.println("Verilen dizi"+ Arrays.toString(dizi));
        System.out.println("En küçük eleman "+ rekursifEnKucuk(dizi,n));
    }
    static int rekursifEnKucuk(int[] dizi,int n){
        if (n==1)
            return dizi[0];
        return Math.min(dizi[n-1], rekursifEnKucuk(dizi,n-1));
    }

}
