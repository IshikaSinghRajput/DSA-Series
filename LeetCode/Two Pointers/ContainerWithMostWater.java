public class ContainerWithMostWater {

    public static int containsWater(int[] arr){
        int left = 0;
        int right = arr.length-1;

        int maxWater = 0;

        while(left < right){
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;

            maxWater = Math.max(maxWater, area);

            if(arr[left] < arr[right]) left++;
            else right--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(containsWater(arr));
    }
}
