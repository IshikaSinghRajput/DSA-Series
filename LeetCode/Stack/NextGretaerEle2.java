import java.util.Arrays;
import java.util.Stack;

public class NextGretaerEle2 {

    public static int[] next(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        for(int i = 2*n-1; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] <= arr[i%n]) st.pop();

            if(i < n){
                if(st.isEmpty()) res[i] = -1;
                else res[i] = arr[st.peek()];

            }
            st.push(i%n);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(next(arr)));
    }
}
