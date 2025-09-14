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

        Node(int val) {
            this.val = val;
        }
    }

    static class LLStack {
        Node head = null;

        void push(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }

        int pop() {
            if (head == null) {
                System.out.println("Empty");
                return -1;
            }

            int x = head.val;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Empty");
            }
            return head.val;
        }

        void display() {
            if (head == null)
                System.out.println("Empty");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static boolean brackets(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(')
                    st.pop();
            }
        }

        if (st.size() > 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        System.out.println(brackets('(())'));
    }
}
