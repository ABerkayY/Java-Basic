public class rekfibo {
    public static void main(String[] args) {
        int []dizi = {1,9,5,84,47,358,547};
        //System.out.println(reküfibo(5));
        //System.out.println(reküfak(5));
        //System.out.println(reknekadar(10));
        //System.out.println(palidrom(1312131));
        //System.out.println(yildizmatris1(5,1));

    }
    /*static int reküfibo(int n){
        if(n==1) return 1;
        if (n==0) return 1;
        return (reküfibo(n-1)+reküfibo(n-2));
    }*/

    /*static int reküfak(int n){
        if (n>=1){
            return (n*reküfak(n-1));
        }
        else
        return 1;9++
    }*/
    /*static int reknekadar(int n){

        if (n==0)
         return 0;
        return n+reknekadar(n-1);
    }*/

    /*static boolean palidrom(int n){
        int gsayi =n;
        int ysayi =0;
        int kalan = 0;
        for (int bisi = 0; gsayi > 0; bisi++) {

            kalan = gsayi % 10;
            gsayi = (gsayi - kalan) / 10;
            ysayi = ysayi * 10 + kalan;

        }
        if (ysayi ==n)
            return true;
        else return
                false;
    }*/
   /* public static int yildizmatris2(int n,int i,int j){
        if (j==n+1)
            return -1;
        if ((i+j)==n+1 || i ==j)
            System.out.print("*");
        else
            System.out.print(" ");
        return yildizmatris2(n,i,j);
    }

    public static int yildizmatris1(int n,int i){
        if (i==n+1)
            return -1;
    yildizmatris2(n,i,1);
        System.out.print("\n");
        return yildizmatris1(n,i+1);
    }*/

}
