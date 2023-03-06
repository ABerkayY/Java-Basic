import static java.util.logging.Logger.global;

public class blackJack {
    //public static int kart;
    static int kart =0;

    public static int kartDagit() {

         kart = (int) (Math.random() * 10 + 1);
        System.out.println("Çektiğiniz kart: " + " " + kart);


        return kart;
    }

    public static void masaKartDagit() {
        int kart = (int) (Math.random() * 10 + 1);
        System.out.println(kart);


    }


    public static void main(String[] args) {

        int oyuncuPuan = 0;
        int masaPuan = 0;
        int masa = kartDagit();
        int oyuncu = kartDagit();
        masaPuan += kartDagit();
        System.out.println(kart);


    }


}

