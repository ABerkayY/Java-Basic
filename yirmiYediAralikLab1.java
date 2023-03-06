public class yirmiYediAralikLab1 {
    //GİRİLEN METNİ TERS YAZDIRMA
    public static void main(String[] args) {
        String metin = "berkay";
        System.out.println(tersYaz(metin));

    }
    static String tersYaz(String metin){
        if (metin.isEmpty())
            return metin;
        else
            return tersYaz(metin.substring(1))+metin.charAt(0);

    }
}
