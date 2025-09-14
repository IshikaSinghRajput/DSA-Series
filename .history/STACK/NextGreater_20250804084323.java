public class NextGreater {

    public static void next(int[] arr) {
        Stack<Integer> st = new Stack<>();

    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 6, 4 };
        int[] res = next(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + "");
        }
    }
}
