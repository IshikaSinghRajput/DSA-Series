import java.util.*;

public class FirstNdLastEle {
    
        public int[] searchRange(int[] arr, int target) {
            int[] ans = {-1, -1};
            // Check for the first occurrence of the target
            int start = search(arr, target, true);
            if (start == -1) {
                return ans; // If the target is not found, return [-1, -1]
            }
            // Check for the last occurrence of the target
            int end = search(arr, target, false);
            
            ans[0] = start;
            ans[1] = end;
            return ans;
        }
    
        public static int search(int[] arr, int target, boolean findStartIndex) {
            int ans = -1;
            int start = 0;
            int end = arr.length - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    // Target is found
                    ans = mid;
                    if (findStartIndex) {
                        // Narrow down to the left side for the first occurrence
                        end = mid - 1;
                    } else {
                        // Narrow down to the right side for the last occurrence
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }

        public static void main(String args[]){
            FirstNdLastEle obj = new FirstNdLastEle();
            int[] arr = {5, 7, 7, 8, 8, 10};
            int target = 8;
            int[] result = obj.searchRange(arr, target);
    
            System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
            
        }
    
    }

