package linked.list;
public class IntLinkedList {
      // Struktur Node
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;
    // Tambah node di akhir list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // Menampilkan isi Linked List
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.print("Isi Linked List: ");
        list.printList();
    }
}