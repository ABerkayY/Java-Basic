import java.util.Scanner;

public class altiAralikLab2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String metin = giris.nextLine().toLowerCase();
        System.out.println( "Girdiğiniz cümlede "+ sesliHarfHesapla(metin)+" adet sesli harf vardır.");


    }

    static int sesliHarfHesapla(String metin) {
metin = metin.toLowerCase();
int sayac=0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i)=='a'|| metin.charAt(i)=='ü'||metin.charAt(i)=='ö'||metin.charAt(i)=='e'||metin.charAt(i)=='u'||metin.charAt(i)=='o'||metin.charAt(i)=='i'||metin.charAt(i)=='ı')
            sayac+=1;
        }
    return sayac;}
}


