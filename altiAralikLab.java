import java.util.Scanner;

public class altiAralikLab {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Yarıçap giriniz ");
        double r = sc.nextDouble();
        System.out.println("Girilen çemberin çevresi: "+cevre(r));
        System.out.println("Girilen çemberin alanı: "+ alan(r));
    }
    static double alan (double r){

        return 2*Math.PI*r;
    }
    static double cevre (double r){
        return Math.PI*Math.pow(r,2);
    }
}
