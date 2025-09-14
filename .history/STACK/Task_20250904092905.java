import java.util.Stack;

public class Task {

    // Array Implementation
    static class ArrayImpl {
        private int[] arr = new int[5];
        int idx = 0;

        void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Empty");
                return -1;
            } else {
                int top = arr[idx - 1];
                arr[idx - 1] = 0;
                idx--;
                return top;
            }
        }

        void display() {
            if (idx == 0) {
                System.out.println("Empty");
                return;
            } else {
                for (int i = 0; i < idx; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    // LinkedList Implementation
    static class Node {
        int val;
        Node next;

        void Node(int val) {
            this.val = val;
        }
    }

    static class LLStack {
        Node head = null;

        void push(int val) {
            if (head == null)
                System.out.println("Empty");
            Node temp = head;
            temp.next = head;
            head = temp;
        }

        int pop() {
            if (head == null)
                System.out.println("Empty");
            int x = head.val;
            head = head.next;
            return x;
        }

        Node peek() {
            if (head == null) {
                System.out.println("Empty");
            }
            return head;
        }

        void display() {
            if (head == null)
                System.out.println("Empty");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        // ArrayImpl st = new ArrayImpl();
        LLStack st = new LLStack();
        st.push(12);
        st.push(22);
        st.push(23);
        st.push(42);

        st.display();
        st.pop();
        st.display();

    }
}
