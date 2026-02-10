public class MaxConsectiveOnes2 {
    //Max flip of 0 -> 1

    public static int maxOnes(int[] arr){
        int left = 0;
        int ans = 0;
        int win = 0;

        for(int i = 0; i < arr.length; i++){
            win += arr[i];
            while(!(win == i - left + 1 || win == i - left)) win -= arr[left++];
            ans = Math.max(ans, i - left + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(maxOnes(arr));
    }
}
