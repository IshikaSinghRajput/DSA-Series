public class MaximumSubArrayAverageSum1 {

    public static double averageSum(int[] arr, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int maxSum = sum;

        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(sum, maxSum);
        }

        return (double)maxSum/k;
    }
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};

        System.out.println(averageSum(arr, 4));
    }
}
