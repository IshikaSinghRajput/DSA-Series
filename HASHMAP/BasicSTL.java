import java.util.HashMap;

public class BasicSTL {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Ishika", 20);
        mp.put("Ravi", 25);
        mp.put("Akash", 18);

        System.out.println(mp.get("Ishika"));
        System.out.println(mp.entrySet());

        mp.putIfAbsent("Shanvi", 21);

        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
    }
}
