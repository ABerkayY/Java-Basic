import java.util.Scanner;

public class odevvv {
    static boolean gecerliSifre(String password) {
        int uzunluk = password.length();
        if (uzunluk <= 7) {
            System.out.println("Şifre en az 8 karakterden oluşmalıdır.");
            return false;
        }
        int rakamSayısı = 0;
        int harfSayısı = 0;
        for (int i = 0; i < uzunluk; i++) {
            char kChar = password.charAt(i);
            int turkceK=password.charAt(i);
            if (kChar >= '0' && kChar <= '9') {
                rakamSayısı++;
            }

            kChar = Character.toUpperCase(kChar);
            if (kChar >= 'A' && kChar <= 'Z' || kChar >= 'a' && kChar <= 'z'|| turkceK== 'ğ' || turkceK== 'Ğ'|| turkceK == 'ş'|| turkceK== 'Ş'|| turkceK == 'ö'|| turkceK== 'Ö'|| turkceK == 'ü'|| turkceK== 'Ü'|| turkceK == 'ç'|| turkceK== 'Ç'|| turkceK == 'ı'||  turkceK == 'İ') {
                harfSayısı++;
            }
        }
        if (rakamSayısı < 2) {
            System.out.println("En az iki rakam içermelidir.");
            return false;
        }
        if (harfSayısı + rakamSayısı != uzunluk) {
            System.out.println("Şifre sadece harf ve rakamlardan oluşmalıdır!");
            return false;
        }
        System.out.println("Geçerli şifre");
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz: ");
        String sifre = scan.nextLine();
        System.out.println();
        scan.close();
        gecerliSifre(sifre);
    }
}