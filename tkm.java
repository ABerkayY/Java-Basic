import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class tkm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TAŞ-KAĞIT-MAKAS oyununa hoşgeldiniz!");
        System.out.println("Başlamak için 'e' tuşuna basınız.\nÇıkmak için 'q' tuşuna basınız. ");
        String cevap = sc.nextLine();
        cevap.toLowerCase();
        char c = cevap.charAt(0);
        boolean dewam = true;
        if (c == 'e'){
while (dewam){
        oyun();
            }
        }
        else System.out.println("Gülü gülü!");

    }
    static boolean oyun(){
        boolean dewam = true;
        ArrayList<String> tkms = new ArrayList<String>();
        tkms.add("TAŞ");
        tkms.add("KAĞIT");
        tkms.add("MAKAS");
        int bilgT = 0;
        Random rast = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Birini seçiniz\n1-TAŞ\n2-KAĞIT\n3-MAKAS");
        int oyuncuT = sc.nextInt()-1;
        if (oyuncuT==0||oyuncuT==1||oyuncuT==2){
            dewam = true;
        }
        else{
            dewam = false;
        }
            String oyuncuS = tkms.get(oyuncuT);
            bilgT = (int) (Math.random() * 3);
            String bilgS = tkms.get(bilgT);
            if (oyuncuS=="TAŞ"&&bilgS=="TAŞ") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("BERABERE");}
            else if (oyuncuS=="TAŞ"&&bilgS=="KAĞIT") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("KAYBETTİNİZ");}
            else if (oyuncuS=="TAŞ"&&bilgS=="MAKAS") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("KAZANDINIZ");}
            else if (oyuncuS=="KAĞIT"&&bilgS=="MAKAS") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("KAYBETTİNİZ");}
            else if (oyuncuS=="KAĞIT"&&bilgS=="TAŞ") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("KAZANDINIZ");}
            else if (oyuncuS=="KAĞIT"&&bilgS=="KAĞIT") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("BERABERE");}
            else if (oyuncuS=="MAKAS"&&bilgS=="KAĞIT") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("KAZANDINIZ");}
            else if (oyuncuS=="MAKAS"&&bilgS=="TAŞ") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("KAYBETTİNİZ");}
            else if (oyuncuS=="MAKAS"&&bilgS=="MAKAS") {
                System.out.println("Bilgisayarın seçimi: " + bilgS);
                System.out.println("BERABERE");}




  return dewam;}


}


