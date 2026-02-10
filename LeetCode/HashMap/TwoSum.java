import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int need = target - arr[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
