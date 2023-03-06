public class yirmiAralik {
    public static void main(String[] args) {
        //rekrusifCiftSayiYazdirma(6);
        System.out.println(ciftToplam(9));
    }
    static void rekrusifCiftSayiYazdirma(int n){
        if (n!=0){
          if (n%2==0){
              rekrusifCiftSayiYazdirma(n-1);
              System.out.println(n);

          }
        else
              rekrusifCiftSayiYazdirma(n-1);
        }

    }
    static int ciftToplam(int n){
    if (n==0){
        return 0;

    }
    else if (n%2==1)
        return ciftToplam(n-1);
    else
        return n + ciftToplam(n-2);
    }
}
