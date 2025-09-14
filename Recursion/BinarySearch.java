public class BinarySearch {
    public int search(int[] arr, int target, int s, int e) {

        if (s > e) return -1; // Base case: target not found

        int mid = s + (e - s) / 2; // Calculate mid to avoid overflow
        if (arr[mid] == target) return mid; // Target found
        else if (target < arr[mid]) {
            return search(arr, target, s, mid - 1); // Search in the left half
        } else {
            return search(arr, target, mid + 1, e); // Search in the right half
        }
    }

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int target = 4; // Example target

        // Initial call to search with start (0) and end (arr.length - 1)
        int result = solution.search(arr, target, 0, arr.length - 1);
        System.out.println("Index of target: " + result); // Output: 3
    }
}
