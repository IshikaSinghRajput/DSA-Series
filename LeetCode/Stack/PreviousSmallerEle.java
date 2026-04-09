import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerEle {

    public static int[] prevSmall(int[] arr){
        Stack<Integer> st = new Stack<>();

        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            while(st.size() > 0 && st.peek() >= arr[i]) st.pop();

            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,0,8,6};
        System.out.println(Arrays.toString(prevSmall(arr)));
    }
}
