import java.util.Arrays;

public class ValidMountainArray {

    public static boolean mountainArray(int[] arr){
        int n = arr.length;
        if(n < 3) return false;
        int i = 0;
        
        //strictly increasing
        while(i + 1 < n && arr[i] < arr[i+1]) i++;

        //checking peak
        if(i == 0 || i == n-1) return false;

        //strictly decreasing
        while(i + 1 < n && arr[i] > arr[i+1]) i++;

        return i == n - 1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,5};
        System.out.println(mountainArray(arr));
    }
}
 