import java.util.Arrays;

public class BubbleSort {

    static void func(int[] arr, int r, int c){
        if(r == 0) return;

        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
                func(arr, r, c+1);
        }
        else{
            func(arr, r-1, 0);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        func(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));   
    }
}
