import java.util.LinkedList;
import java.util.Queue;

public class PraktikumQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // ENQUEUE
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Isi Queue: " + queue);

        // PEEK
        System.out.println("Elemen depan: " + queue.peek());

        // DEQUEUE
        System.out.println("Data yang keluar: " + queue.poll());

        System.out.println("Queue setelah dequeue: " + queue);
    }
}