package perbandinganlist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class PerbandinganList {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        // ==========================
        // ARRAY LIST
        // ==========================
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startArray = System.nanoTime();

        for (int i = 0; i < jumlahData; i++) {
            arrayList.add(i);
        }

        long endArray = System.nanoTime();
        long waktuArray = (endArray - startArray) / 1_000_000; // ke milisecond


        // ==========================
        // LINKED LIST
        // ==========================
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startLinked = System.nanoTime();

        for (int i = 0; i < jumlahData; i++) {
            linkedList.add(i);
        }

        long endLinked = System.nanoTime();
        long waktuLinked = (endLinked - startLinked) / 1_000_000; // ke milisecond


        // ==========================
        // HASIL
        // ==========================
        System.out.println("\n===== HASIL PERBANDINGAN =====");
        System.out.println("Jumlah Data        : " + jumlahData);
        System.out.println("Waktu ArrayList    : " + waktuArray + " ms");
        System.out.println("Waktu LinkedList   : " + waktuLinked + " ms");

        if (waktuArray < waktuLinked) {
            System.out.println("ArrayList lebih cepat.");
        } else if (waktuLinked < waktuArray) {
            System.out.println("LinkedList lebih cepat.");
        } else {
            System.out.println("Keduanya memiliki waktu yang sama.");
        }

        input.close();
    }
}
      
