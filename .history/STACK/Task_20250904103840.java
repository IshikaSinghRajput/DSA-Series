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
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            if (idx == 0) {
                System.out.println("Empty");
                return;
            }
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
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
                return -1;
            }
            return head.val;
        }

        void display() {
            if (head == null) {
                System.out.println("Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Balanced Brackets Problem
    public static boolean brackets(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // Closing bracket → check top
            else {
                if (st.isEmpty())
                    return false;

                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    // Reverse a String using stack
    public static void reverse(String str) {
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            st.push(ch);
            System.out.print(st.pop() + " ");
        }
    }

    // Main function
    public static void main(String[] args) {

        System.out.println(brackets("()")); // true
        System.out.println(reverse("bhai"));

    }
}
