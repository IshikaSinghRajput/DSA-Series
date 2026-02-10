import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSum(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            int sum = arr[s] + arr[e];

            if(sum == target) return new int[] {s+1,e+1};
            else if(sum < target) s++;
            else e--;
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};

        int[] res = twoSum(arr, 9);
        System.out.println(Arrays.toString(res));
    }
}
