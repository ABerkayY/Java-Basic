import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz: ");
        String sifre = giris.nextLine();
        sifreKontrol(sifre);

    }

    static String sifreKontrol(String sifre) {
        int sayac = 0;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) == '0' || sifre.charAt(i) == '1' || sifre.charAt(i) == '2' || sifre.charAt(i) == '3' || sifre.charAt(i) == '4' || sifre.charAt(i) == '5' || sifre.charAt(i) == '6' || sifre.charAt(i) == '7' || sifre.charAt(i) == '8' || sifre.charAt(i) == '9')
                sayac += 1;
        }
        if (sifre.length() <= 7 || sayac <= 1) {
            System.out.println("Geçersiz şifre! Şifreniz 8 karakter uzunluğunda ve 2 rakam içermelidir!");
        }
        else
            System.out.println("Geçerli şifre");


        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) == '.' || sifre.charAt(i) == ',' || sifre.charAt(i) == '!' || sifre.charAt(i) == '?' || sifre.charAt(i) == ';')
                System.out.println("Geçersiz şifre");

        }



        return sifre;
    }
}
