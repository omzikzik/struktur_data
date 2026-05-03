import java.util.Stack;

public class PraktikumStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // PUSH
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Isi Stack: " + stack);

        // PEEK
        System.out.println("Elemen teratas: " + stack.peek());

        // POP
        System.out.println("Data yang dihapus: " + stack.pop());

        System.out.println("Stack setelah pop: " + stack);
    }
}