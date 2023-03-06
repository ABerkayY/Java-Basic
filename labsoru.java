public class labsoru {
    public static void main(String[] args) {
        int kontrol = 1;
        for (int sayi = 20; sayi < 200; sayi++) {
            {
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        kontrol = 0;
                        break;
                    }
                    else {
                        kontrol = 1;
                    }
                }
            }
            if (kontrol == 1) {
                System.out.print(sayi+" ");
            }
        }
    }
}




