public class averageOfElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int avg = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / 2;
        System.out.println(avg);
    }
}
