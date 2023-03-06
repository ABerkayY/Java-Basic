import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class yirmiyediAralıkDers {
    public static void main(String[] args) {
       /* ArrayList<String> dersler = new ArrayList<String>();
        dersler.add("Fizik");
        dersler.add("Matematik");
        dersler.add("Algoritma");
        System.out.println(dersler.set(0,"BMG"));
        System.out.println(dersler.get(0));
        System.out.println(dersler);
        ArrayList<Integer>sayiDizisi = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int a = (int)(Math.random()*10);
            sayiDizisi.add(a);

        }
        System.out.println(sayiDizisi);
        Collections.sort(sayiDizisi);
        Collections.reverse(sayiDizisi);
        System.out.println("Tersten sıralanmış hali = "+ "\n"+ sayiDizisi);*/

        ArrayList<Integer>besEleman = new ArrayList<Integer>();
        besEleman.add((Integer) 1);
        besEleman.add((Integer) 6);
        besEleman.add((Integer) 14);
        besEleman.add((Integer) 7);
        besEleman.add((Integer) 5);
        System.out.println(besEleman);
        double toplam = 0;
        for (int i = 0; i < besEleman.size(); i++) {

            toplam += besEleman.get(i);


        }
        double ortalama = toplam/besEleman.size();
        System.out.println("Ortalama = "+ortalama);




    }
}
