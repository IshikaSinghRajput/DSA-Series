import java.util.HashMap;

public class ContainsDuplicate {

    public static boolean duplicate(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        System.out.println(duplicate(arr));
    }
}
