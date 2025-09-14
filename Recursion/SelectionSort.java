import java.util.Arrays;

public class SelectionSort {
    
    static void func(int[] arr, int r, int c, int max){
        if(r == 0) return;

        if(c < r){
            if(arr[c] > arr[max]){
                func(arr, r, c+1, c);
            }
            else{
                func(arr, r, c+1, max);
            }
        }
        else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            func(arr, r-1, 0, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,4};
        func(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
