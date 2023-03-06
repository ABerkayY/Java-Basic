import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Hangi sayının faktöriyelini istiyorsunuz? ");
        int n = sc.nextInt();
        long sayac = 1;

        for (int i = 1;i<n+1;i++){
            sayac = i*sayac;

        }
        String cvp = String.format("%d sayısının faktöriyeli %d",n,sayac);
        System.out.println(cvp);
        /*int fak = 1;
        while (sayac<=n ){
            fak = fak * sayac;
            sayac +=1;
            System.out.println(fak);*/



        }





    }
