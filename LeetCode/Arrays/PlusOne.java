import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] arr){
        int n = arr.length;
        for(int i = n-1; i >=0; i++){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;   //carry
        }

        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
