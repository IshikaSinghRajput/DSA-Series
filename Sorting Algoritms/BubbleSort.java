import java.util.*;

public class BubbleSort {

    // public static void sorting(int[] arr){
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = 1; j < arr.length - i; j++){
    //             if(arr[j] < arr[j-1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j-1];
    //                 arr[j-1] = temp;
    //             }
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,3,5,4,2};
    //    sorting(arr);
    //    System.out.println(Arrays.toString(arr));
       
    // }

    public static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern(4);
       
    }
}
