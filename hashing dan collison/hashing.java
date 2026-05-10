import java.util.Scanner;

public class HashingCollision {

    // Ukuran hash table
    static int SIZE = 10;

    // Hash table
    static Integer[] hashTable = new Integer[SIZE];

    // Fungsi hash
    static int hashFunction(int key) {
        return key % SIZE;
    }

    // Method insert dengan Linear Probing
    static void insert(int key) {

        int index = hashFunction(key);

        System.out.println("\nData : " + key);
        System.out.println("Hash Index : " + index);

        // Jika collision
        while(hashTable[index] != null) {

            System.out.println("Collision pada index " + index);

            // Linear Probing
            index = (index + 1) % SIZE;
        }

        hashTable[index] = key;

        System.out.println("Data disimpan pada index " + index);
    }

    // Menampilkan hash table
    static void display() {

        System.out.println("\n=== HASH TABLE ===");

        for(int i = 0; i < SIZE; i++) {

            System.out.print("Index " + i + " : ");

            if(hashTable[i] != null) {
                System.out.println(hashTable[i]);
            } else {
                System.out.println("kosong");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.print("Masukkan data ke-" + (i+1) + ": ");
            int data = input.nextInt();

            insert(data);
        }

        display();
    }
}