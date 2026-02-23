package array;
public class Array {
    public static void main(String[] args) {
    // 1. Deklarasi & Inisialisasi
    int[] nilai = {85, 90, 78, 92, 88};
    System.out.println("Nilai ke-2: " + nilai[1]); // Akses O(1)

    // 2. Update Data
    nilai[2] = 80;

    // 3. Traversal (Looping)
    for (int n : nilai) { System.out.print(n + " "); }
    System.out.println();

    // 4. Sisip di indeks 2 (Manual: buat array baru, geser)
    int[] baru = new int[nilai.length + 1];
    for (int i=0, j=0; i < baru.length; i++) {
    if (i == 2) baru[i] = 100; else baru[i] = nilai[j++];
    }

    // 5. Pencarian Linear O(n)
    int cari = 92; boolean ketemu = false;
    for (int x : baru) if (x == cari) { ketemu = true; break; }
    System.out.println("Ketemu 92? " + ketemu);
   }
}