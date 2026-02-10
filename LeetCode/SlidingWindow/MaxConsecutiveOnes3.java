public class MaxConsecutiveOnes3 {

    public static int maxOnes(int[] arr, int k){
        int left = 0;
        int ans = 0;
        int win = 0;

        for(int i = 0; i < arr.length; i++){
            win += arr[i];

            while(win + k < i - left + 1){
                win -= arr[left];
                left++;
            }

            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxOnes(arr, 2));
    }
}
