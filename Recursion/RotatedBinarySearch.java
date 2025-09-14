public class RotatedBinarySearch {
    
    static int func(int[] arr, int target, int s, int e){

        if(s > e) return -1;
        
        int m = s + (e-s)/2;

        if(arr[m] == target) return m;

        if(arr[s] <= m){
            if(target >= arr[s] && target <= arr[m]){
                return func(arr, target, s, m-1);
            }
            else{
                return func(arr, target, s, m-1);
            }
        }
        else{
            if(target >= arr[m] && target <= arr[e]){
                return func(arr, target, m+1, e);
            }
        }
        return func(arr, target, s, m-1);

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(func(arr, 7, 0, arr.length-1));
    }
}
