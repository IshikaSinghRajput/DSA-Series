import java.util.Stack;

public class Task {
    class ArrayImpl {
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
                for (int i = 0; i < idx - 1; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.pop();

    }
}
