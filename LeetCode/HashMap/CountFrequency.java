import java.util.HashMap;

public class CountFrequency {

    public static void countFreq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else map.put(arr[i], 1);
        }
        
        for(int key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 20};
        countFreq(arr);
    }
}
