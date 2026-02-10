public class binanrySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 4;
        boolean found = false;

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}
