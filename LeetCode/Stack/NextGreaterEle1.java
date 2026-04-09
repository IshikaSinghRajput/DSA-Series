import java.util.Arrays;
import java.util.Stack;

public abstract class NextGreaterEle1 {

    public static int[] nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            while(st.size() > 0 && st.peek() < arr[i]) st.pop();

            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
            return res;
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
