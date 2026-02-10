public class MinimumSizeSubArraySum {

    public static int minSubArraySize(int[] arr, int t){
        int n = arr.length;
        int left = 0;
        int win = 0;
        int ans = n + 1;

        for(int right = 0; right < n; right++){
            win += arr[right];

            while(win >= t){
                ans = Math.min(ans, right - left + 1);
                win -= arr[left];
                left++;
            }
        }
        return ans == n + 1 ? 0 : ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArraySize(arr, 7));
    }
}
