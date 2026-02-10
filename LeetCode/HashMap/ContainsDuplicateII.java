import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static boolean isDuplicate(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int prevIdx = map.get(arr[i]);
                if(i - prevIdx <= k) return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(isDuplicate(arr, k));
    }
}
