import java.util.Arrays;

public class reverseAnArray {

    public static void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void reverse2(int[] arr, int s, int e){
        if(s >= e) return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

         reverse2(arr, s+1, e-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse2(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
