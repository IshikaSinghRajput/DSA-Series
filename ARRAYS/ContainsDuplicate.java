public class ContainsDuplicate {

    public static boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 3, 4, 5, 2 };
        System.out.println(duplicate(arr));
    }
}
