
import java.util.Arrays;

public class SelectionSort {
    public static void sorting(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = maxValue(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int maxValue(int[] arr, int start, int end){
       int max = start;
       for(int i = start; i<=end; i++){
        if(arr[max] < arr[i]){
            max = i;
            }
       }
       return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,3};
       sorting(arr);
       System.out.println(Arrays.toString(arr));
    }
}
