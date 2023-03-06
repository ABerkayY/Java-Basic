import java.util.Scanner;

public class kelime_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String kelime = sc.nextLine().toLowerCase();
        String gecici = "";
        int sayac = 0;
        for (int i = kelime.length(); i > 0; i--) {
            gecici = gecici + kelime.charAt(i - 1);

        }
        System.out.println(kelime+" "+gecici);
        for (int i = 0; i < kelime.length(); i++) {

                if (kelime.charAt(i) == gecici.charAt(i)) {
                    sayac++;

            }
        }
        if (sayac == kelime.length()) {
            System.out.println(kelime + " " + " kelimesi palindrom bir kelimedir.");
        }
        else
            System.out.println(kelime + " " + " kelimesi palindrom bir kelime değildir.");
    }
}

