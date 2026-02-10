import java.util.Arrays;

public class SearchAnElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 6;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
        System.out.println();

    }
}
