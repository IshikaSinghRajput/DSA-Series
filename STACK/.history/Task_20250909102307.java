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

    // Min Stack
    static int minStack(int[] arr) {
        if (arr.length == 0)
            return -1;
        int min = Integer.MAX_VALUE;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        for (int i = arr.length; i >= 0; i++) {
            if (st.peek() < min) {
                min = st.peek();
                st.pop();
            }
        }
        return min;
    }

    // Reverse a String using stack
    static void reverse(String str) {
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
        System.out.println();
    }

    // PostFix Evaluation
    static void postFix(String str) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ch >= 48 && ch <= 57)
                st.push(ch + " ");
            else {
                String v2 = st.pop();
                String v1 = st.pop();
                char op = ch;
                String t = '(' + v1 + op + v2 + ')';
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }

    // Main function
    public static void main(String[] args) {
        // postFix("953+4*6/-");
        int[] arr = { 5, 2, 1, 3, 4 };
        System.out.println(minStack(arr));
    }
}
