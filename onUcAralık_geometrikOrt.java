public class onUcAralık_geometrikOrt {
    public static void main(String[] args) {
        System.out.println(geometrikOrt(3,3));
        System.out.println(geometrikOrt(2,3,4));
    }
    static double geometrikOrt(double sayi1,double sayi2,double sayi3){
        double sayi = sayi1* sayi2*sayi3;
        double kuvvet =(double) 1/(double)3;
        return Math.pow(sayi,(double) 1/3);

    }
    static double geometrikOrt(double sayi1,double sayi2){
        double sayi = sayi1* sayi2;
        double kuvvet =(double) 1/(double)3;
        return Math.pow(sayi,(double) 1/3);

    }
}
