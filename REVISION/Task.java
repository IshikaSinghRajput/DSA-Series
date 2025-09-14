import java.util.*;

public class Task{
   public static void main(String[] args){
        int[] arr = {5,8,3,4,2};
        bulbul(arr);
        System.out.println(Arrays.toString(arr));
   }

   static void bulbul(int[] arr){
    for(int i = 0; i < arr.length-1; i++){
        for(int j = 0; j < arr.length-1-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }
}