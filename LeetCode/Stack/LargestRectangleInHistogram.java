import java.util.Stack;

class LargestRectangleInHistogram {

    public static int histogram(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        //Left
        for(int i = n - 1; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] > arr[i]) st.pop();
            left[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }

        while(st.isEmpty()) st.pop();

        //Right
        for(int i = 0; i < n; i++){
            while(st.size() > 0 && arr[st.peek()] > arr[i]) st.pop();
            right[i] = st.empty() ? n : st.peek();
            st.push(i);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            int width = left[i] - right[i] - 1;
            int currArea = arr[i] * width;
            ans = Math.max(ans, currArea);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        System.out.println(histogram(arr));
    }
}