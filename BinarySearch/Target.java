import java.util.*;

public class Target {

    public static int[] search(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = binarySearchhh(arr, target, true);
        if(start == -1) return ans;

        int end = binarySearchhh(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int binarySearchhh(int arr[], int target, boolean firstStartIndex){
            int ans = -1;
            int start = 0;
            int end = arr.length-1;
            int mid = start + (end - start)/2;

            while(start < end){
                
             if(target < arr[mid]){
                    end = mid -1;
                }
                else if(arr[mid] > target){
                    start = mid + 1;
                }
                else{
                    ans = mid;
                    if(firstStartIndex){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
            return ans;
    }

    public static void main(String args[]){
        Target obj = new Target();
        int[] arr = {1,2,4,4,5,6};
        int target = 4;
        int[] result = obj.search(arr, target);
        System.out.println("First and last Index are : [" + result[0] + "," + result[1] + "]");
    }
}
