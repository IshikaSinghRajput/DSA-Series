public class MaxConsecutiveOnes {

    public static int maxOnes(int[] arr){
        int left = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                left = i + 1;
            }

            max = Math.max(max, i - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxOnes(arr));
    }
}
