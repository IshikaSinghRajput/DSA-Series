public class CheckIfArrIsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 5 };
        boolean flag = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
                break;
            } else
                flag = true;
        }

        if (flag) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }
}
