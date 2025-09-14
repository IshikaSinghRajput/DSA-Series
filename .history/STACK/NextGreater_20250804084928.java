import java.util.*;

public class NextGreater {

    public static void next(int[] arr) {
        int n = arr.length;
        int res = new int[st.size()];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() == 0)
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(i);

        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 6, 4 };
        int[] res = next(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + "");
        }
    }
}
