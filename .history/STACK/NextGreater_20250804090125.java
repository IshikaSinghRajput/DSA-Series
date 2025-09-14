import java.util.*;

public class NextGreater {

    public static int[] next(int[] arr) {
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0)
                res[i] = -1;
            else
                res[i] = st.peek();

            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 6, 4 };
        int[] res = next(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.println("Next Greater Elements: " + Arrays.toString(res));
        }
    }
}
