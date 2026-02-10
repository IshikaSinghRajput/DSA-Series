import java.util.HashMap;

class CountFreq {

    public static HashMap<Integer, Integer> Count(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 20, 30, 10 };
        System.out.println(Count(arr));
    }
}
