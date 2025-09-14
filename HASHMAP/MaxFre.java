package HASHMAP;

import java.util.HashMap;

public class MaxFre {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 4, 1 };
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(i)) {
                mp.put(i, 1);
            } else {
                mp.put(i, mp.get(i) + 1);
            }
        }
        System.out.println(mp.entrySet());
        int max = 0, ansKey = -1;
        for (var e : mp.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(max);
    }
}
