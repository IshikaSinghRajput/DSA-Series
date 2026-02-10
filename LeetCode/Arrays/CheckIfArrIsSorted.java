import java.util.Arrays;

public class CheckIfArrIsSorted {

    public static boolean sorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                ascending =  false;

            else if(arr[i] > arr[i - 1]) descending = false;
        }
        return ascending || descending;
    }

    public static void sorted2(int[] arr){
        
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

    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        sorted2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
