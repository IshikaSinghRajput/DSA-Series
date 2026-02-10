import java.util.Arrays;

public class SecondLargestElement {

    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int res = secondLargest(arr);
        System.out.println(res);
    }
}
