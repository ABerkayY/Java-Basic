import java.util.Scanner;

public class adamAsmaca {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Harf giriniz: ");
        String harf = giris.next().toLowerCase();
        char ih = harf.charAt(0);
        String kelime = "emre";
        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ih) {
                sayac += 1;

            }


        }
        System.out.println(ih + " Harfi kelimede " + sayac + " kere var!");
    }
}
