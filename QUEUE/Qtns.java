import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Qtns {

    public static void reverse(Queue<Integer> q) {
        if (q.size() == 0)
            return;
        int front = q.remove();
        reverse(q);
        q.add(front);
    }

    static void StackRev(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        // Step 1: Dequeue all elements and push into stack
        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        // Step 2: Pop from stack and enqueue back
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        StackRev(q);
        System.out.println(q);
    }
}
