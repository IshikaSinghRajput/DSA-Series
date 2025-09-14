// Ceiling of a number means return target or if target not found than return smallest number that is greater then the target


import java.util.*;

public class CeilingOfArr {

    public static int ceilingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;

    }
    public static void main(String args[]){
        int[] arr = {12,24,36,48,55,63,72};
        int target = 56;
       int ans = ceilingOfNumber(arr, target);
       System.out.println(ans);
    }
}
