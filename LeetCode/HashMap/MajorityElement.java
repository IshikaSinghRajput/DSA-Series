import java.util.HashMap;

public class MajorityElement {

    public static int majority(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if(map.get(arr[i]) > n / 2) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,4,4,5};
        System.out.println(majority(arr));
    }
}
