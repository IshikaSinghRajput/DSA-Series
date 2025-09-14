public class SplitArrLargestSum {
    
    public int splitArray(int[] arr, int m){
            int start = 0;
            int end = 0;

            for(int i = 0; i<arr.length; i++){
                start = Math.max(start, arr[i]);
                end = end + arr[i];
            }

            //Binary Search
            while (start<end) {
                int mid = start(end-start)/2;
                int sum = 0;
                int peices = 1;

                for(int num : arr){
                    if(sum + num > mid){
                        //you cannot add this in this subarray, make  new one
                        //you add this sum in a new subarray, then sum = num
                        sum = num;
                        peices++;
                    }
                    else{
                        sum = sum + num;
                    }
                }

                if(peices > mid){
                    start = mid + 1;
                }
                else{
                    end = mid
                }
            }
    }


    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
    }
}
