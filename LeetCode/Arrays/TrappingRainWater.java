public class TrappingRainWater {

    public static int trappedWater(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] > leftMax)
                    leftMax = arr[left];
                else
                    trappedWater += leftMax - arr[left];
                left++;
            }

            else {
                if (arr[right] > rightMax)
                    rightMax = arr[right];
                else
                    trappedWater += rightMax - arr[right];
                right--;
            }

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedWater(arr));
    }
}
